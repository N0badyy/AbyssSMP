package net.eclipse.tags;

import net.eclipse.LifestealCombat;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> SCYTHE_ENCHANTABLE = of("enchantable/scythe");
    private ModItemTags() {
   }

   private static TagKey<Item> of(String id) {
      return TagKey.of(RegistryKeys.ITEM, Identifier.of(LifestealCombat.MOD_ID, id));
   }
}
