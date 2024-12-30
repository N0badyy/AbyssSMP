package net.eclipse.enchantment;


import com.mojang.serialization.MapCodec;

import net.eclipse.LifestealCombat;
import net.eclipse.enchantment.custom.FrostBiteEnchantmentEffect;
import net.eclipse.enchantment.custom.PullTowardEnchantmentEffect;

import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantmentEffects {
    public static final MapCodec<? extends EnchantmentEntityEffect> GRAPPLING =
            registerEntityEffect("grappling", PullTowardEnchantmentEffect.CODEC);
    public static final MapCodec<? extends EnchantmentEntityEffect> FROST_BITE =
            registerEntityEffect("frostbite", FrostBiteEnchantmentEffect.CODEC);
        


    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name,
                                                                                    MapCodec<? extends EnchantmentEntityEffect> codec) {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(LifestealCombat.MOD_ID, name), codec);
    }

    public static void registerEnchantmentEffects() {
        LifestealCombat.LOGGER.info("Registering Mod Enchantment Effects for " + LifestealCombat.MOD_ID);
    }
}