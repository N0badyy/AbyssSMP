package net.eclipse.datagen;


import net.eclipse.item.ModItems;
import net.eclipse.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {


        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.SCYTHE_ITEM);
        getOrCreateTagBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .add(ModItems.SCYTHE_ITEM);
        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(ModItems.SCYTHE_ITEM);
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.SCYTHE_ITEM);
        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add(ModItems.SCYTHE_ITEM);
        getOrCreateTagBuilder(ModItemTags.SCYTHE_ENCHANTABLE)
                .add(ModItems.SCYTHE_ITEM);
        // getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
        //         .add(ModItems.PINK_GARNET_HELMET)
        //         .add(ModItems.PINK_GARNET_CHESTPLATE)
        //         .add(ModItems.PINK_GARNET_LEGGINGS)
        //         .add(ModItems.PINK_GARNET_BOOTS);

        // getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
        //         .add(ModItems.PINK_GARNET);

        // getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
        //         .add(ModItems.KAUPEN_SMITHING_TEMPLATE);

        // getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
        //         .add(ModBlocks.DRIFTWOOD_LOG.asItem())
        //         .add(ModBlocks.DRIFTWOOD_WOOD.asItem())
        //         .add(ModBlocks.STRIPPED_DRIFTWOOD_LOG.asItem())
        //         .add(ModBlocks.STRIPPED_DRIFTWOOD_WOOD.asItem());

        // getOrCreateTagBuilder(ItemTags.PLANKS)
        //         .add(ModBlocks.DRIFTWOOD_PLANKS.asItem());
    }
}