package net.eclipse.item;



import net.eclipse.LifestealCombat;
import net.eclipse.item.custom.ScytheItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;



public class ModItems {
    public static final Item SCYTHE_ITEM = registerItem("scythe", new ScytheItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(ScytheItem.createAttributeModifiers(ToolMaterials.NETHERITE, 6, -3.0f, 1.2f, 1f)).rarity(Rarity.EPIC).maxCount(1).fireproof()));
    public static final Item SCYTHE_HANDLE = registerItem("scythe_handle", new Item(new Item.Settings()));
    

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LifestealCombat.MOD_ID, name), item);
    }

    
    public static void registerModItems() {
        LifestealCombat.LOGGER.info("Registering Mod Items for " + LifestealCombat.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            // entries.add(ModBlocks.XMAS_TREE);
            entries.add(ModItems.SCYTHE_HANDLE);
            entries.add(ModItems.SCYTHE_ITEM);
            
        });
}}