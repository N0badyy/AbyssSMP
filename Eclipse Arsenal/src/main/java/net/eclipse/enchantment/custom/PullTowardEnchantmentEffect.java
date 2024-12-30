package net.eclipse.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

public record PullTowardEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<PullTowardEnchantmentEffect> CODEC = MapCodec.unit(PullTowardEnchantmentEffect::new);

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        Entity target = context.owner(); // Correct target to the intended entity
        if (target != null) {
            Vec3d userPos = target.getPos(); // Swap positions for pulling target to user
            Vec3d targetPos = user.getPos();

            // Calculate direction vector from user to target
            Vec3d direction = userPos.subtract(targetPos).normalize();

            // Scale the pulling force based on enchantment level
            double pullStrength = 0.8 *level;
            Vec3d pullForce = direction.multiply(pullStrength);

            // Apply the pulling force to the user (who is being pulled towards the target)
            user.addVelocity(pullForce.x, pullForce.y, pullForce.z);
            user.velocityModified = true;
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}