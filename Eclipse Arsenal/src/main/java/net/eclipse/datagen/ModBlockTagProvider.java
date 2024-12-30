package net.eclipse.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
// import net.life_combat.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
// import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                // .add(ModBlocks.AMETHYST_BRICK_BLOCK)
                // .add(ModBlocks.AMETHYST_BRICK_SLAB)
                // .add(ModBlocks.AMETHYST_BRICK_STAIR)
                // .add(ModBlocks.AMETHYST_SLAB)
                // .add(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK)
                // .add(ModBlocks.AMETHYST_STAIR)
                // .add(ModBlocks.POLISHED_AMETHYST_BRICK_SLAB)
                // .add(ModBlocks.POLISHED_AMETHYST_BRICK_STAIRS)
                // .add(ModBlocks.POLISHED_AMETHYST_BRICK_WALL)
                // .add(ModBlocks.AMETHYST_BRICK_WALL)
                // .add(ModBlocks.AMETHYST_WALL);

        

        // getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.PINK_GARNET_FENCE);
        // getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.PINK_GARNET_FENCE_GATE);
        // getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.PINK_GARNET_WALL);

        // getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
        //         .add(ModBlocks.MAGIC_BLOCK);

        // getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
        //         .add(ModBlocks.MAGIC_BLOCK)
        //         .addTag(BlockTags.NEEDS_IRON_TOOL);

        // getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
        //         .add(ModBlocks.DRIFTWOOD_LOG)
        //         .add(ModBlocks.DRIFTWOOD_WOOD)
        //         .add(ModBlocks.STRIPPED_DRIFTWOOD_LOG)
        //         .add(ModBlocks.STRIPPED_DRIFTWOOD_WOOD);
    }
}