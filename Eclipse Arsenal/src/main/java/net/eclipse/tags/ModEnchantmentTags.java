package net.eclipse.tags;

import net.eclipse.LifestealCombat;
import net.minecraft.enchantment.Enchantment;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public interface ModEnchantmentTags {

   TagKey<Enchantment> ELEMENT_EXCLUSIVE_SET = of("exclusive_set/element");
   TagKey<Enchantment> CUSTOM_EXCLUSIVE_SET = of("exclusive_set/custom");
   TagKey<Enchantment> VELOCITY_MODIFER = of("exclusive_set/velocity_modifier");

   
   private static TagKey<Enchantment> of(String id) {
      return TagKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(LifestealCombat.MOD_ID,id));
   }
   
}
