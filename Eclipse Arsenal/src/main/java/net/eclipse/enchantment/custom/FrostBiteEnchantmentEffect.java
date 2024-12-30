package net.eclipse.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;

import net.minecraft.util.math.Vec3d;
import net.minecraft.entity.player.PlayerEntity;

import java.util.HashMap;
import java.util.UUID;

public record FrostBiteEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<FrostBiteEnchantmentEffect> CODEC = MapCodec.unit(FrostBiteEnchantmentEffect::new);
    private static final HashMap<UUID, Long> cooldowns = new HashMap<>();
    private static final long COOLDOWN_TICKS = 100; // 5 seconds (20 ticks per second * 5)

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        // Get the owner (the entity with the enchantment)
        Entity owner = context.owner();
        if (!(owner instanceof PlayerEntity enchantmentOwner)) {
            return;
        }

        if (!(user instanceof PlayerEntity victim)) {
            return;
        }

        // Check cooldown for the owner of the enchantment
        UUID ownerId = enchantmentOwner.getUuid();
        long currentTime = world.getTime();
        if (cooldowns.containsKey(ownerId)) {
            long lastUsedTime = cooldowns.get(ownerId);
            if (currentTime - lastUsedTime < COOLDOWN_TICKS) {
                // Cooldown is active, skip application
                return;
            } else {
                // Cooldown expired, notify the owner
                enchantmentOwner.sendMessage(
                    Text.translatable("enchantment.frostbite.ready"),
                    true // Display in action bar (hotbar)
                );
            }
        }

        // Apply the slowness effect to the victim
        int duration = 60 * level; // 60 ticks per second, scales with level
        int amplifier = level - 1; // Slowness strength increases with level
        StatusEffectInstance slownessEffectInstance = new StatusEffectInstance(StatusEffects.SLOWNESS, duration, amplifier);
        victim.addStatusEffect(slownessEffectInstance);

        // Update cooldown for the enchantment owner
        cooldowns.put(ownerId, currentTime);
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}
