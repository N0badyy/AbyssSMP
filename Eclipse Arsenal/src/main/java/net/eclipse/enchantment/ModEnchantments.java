package net.eclipse.enchantment;


import net.eclipse.LifestealCombat;
import net.eclipse.enchantment.custom.FrostBiteEnchantmentEffect;
import net.eclipse.enchantment.custom.PullTowardEnchantmentEffect;

import net.eclipse.tags.ModEnchantmentTags;
import net.eclipse.tags.ModItemTags;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;

import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

public class ModEnchantments {
    public static final RegistryKey<Enchantment> GRAPPLING =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(LifestealCombat.MOD_ID, "grappling"));
    public static final RegistryKey<Enchantment> FROSTBITE =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(LifestealCombat.MOD_ID, "frostbite"));

    public static void bootstrap(Registerable<Enchantment> registerable) {
        RegistryEntryLookup<Enchantment> enchantments = registerable.getRegistryLookup(RegistryKeys.ENCHANTMENT);
        var items = registerable.getRegistryLookup(RegistryKeys.ITEM);
                 
        register(registerable, GRAPPLING, Enchantment.builder(Enchantment.definition(
                
                items.getOrThrow(ModItemTags.SCYTHE_ENCHANTABLE),
                5,
                1,
                Enchantment.leveledCost(5, 7),
                Enchantment.leveledCost(25, 9),
                2,
                AttributeModifierSlot.MAINHAND))
                // .exclusiveSet(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE_SET))
                .exclusiveSet(enchantments.getOrThrow(ModEnchantmentTags.CUSTOM_EXCLUSIVE_SET)) // Add to exclusive set
                .exclusiveSet(enchantments.getOrThrow(ModEnchantmentTags.VELOCITY_MODIFER)) // Add to exclusive set
                // Enchantments
                .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,
                        EnchantmentEffectTarget.ATTACKER, EnchantmentEffectTarget.VICTIM,
                        new PullTowardEnchantmentEffect()));
        register(registerable, FROSTBITE, Enchantment.builder(Enchantment.definition(
                            items.getOrThrow(ItemTags.SWORDS),
                            
                            
                            
                            5,
                            1,
                            Enchantment.leveledCost(5, 7),
                            Enchantment.leveledCost(25, 9),     
                            4,
                            AttributeModifierSlot.MAINHAND))
                            .exclusiveSet(enchantments.getOrThrow(ModEnchantmentTags.CUSTOM_EXCLUSIVE_SET)) // Add to exclusive set
                            .exclusiveSet(enchantments.getOrThrow(ModEnchantmentTags.ELEMENT_EXCLUSIVE_SET)) // Add to exclusive set
                            
                            
                            .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,
                                    EnchantmentEffectTarget.ATTACKER, EnchantmentEffectTarget.VICTIM,
                                    new FrostBiteEnchantmentEffect()));
        
    }
    


    private static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder) {
        registry.register(key, builder.build(key.getValue()));
    }
}