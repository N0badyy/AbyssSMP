package net.eclipse.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
// import net.life_combat.block.ModBlocks;
// import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    // Create a BlockTexturePool and use it for related models
    // BlockStateModelGenerator.BlockTexturePool amethystbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMETHYST_BRICK_BLOCK);
    // BlockStateModelGenerator.BlockTexturePool amethystPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK);
    // BlockStateModelGenerator.BlockTexturePool polished_amethystpool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK);
    // Use the pool to generate related models for stairs and slabs
    // amethystbrickPool.stairs(ModBlocks.AMETHYST_BRICK_STAIR);
    // amethystbrickPool.slab(ModBlocks.AMETHYST_BRICK_SLAB);
    // amethystbrickPool.wall(ModBlocks.AMETHYST_BRICK_WALL);
    // amethystPool.stairs(ModBlocks.AMETHYST_STAIR);
    
    // amethystPool.slab(ModBlocks.AMETHYST_SLAB);
    // amethystPool.wall(ModBlocks.AMETHYST_WALL);
    // polished_amethystpool.slab(ModBlocks.POLISHED_AMETHYST_BRICK_SLAB);
    // polished_amethystpool.stairs(ModBlocks.POLISHED_AMETHYST_BRICK_STAIRS);
    // polished_amethystpool.wall(ModBlocks.POLISHED_AMETHYST_BRICK_WALL);
}


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        
    //     itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);

    //     itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
    //     // itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
    //     itemModelGenerator.register(ModItems.STARLIGHT_ASHES, Models.GENERATED);

    //     itemModelGenerator.register(ModItems.PINK_GARNET_SWORD, Models.HANDHELD);
    //     itemModelGenerator.register(ModItems.PINK_GARNET_PICKAXE, Models.HANDHELD);
    //     itemModelGenerator.register(ModItems.PINK_GARNET_SHOVEL, Models.HANDHELD);
    //     itemModelGenerator.register(ModItems.PINK_GARNET_AXE, Models.HANDHELD);
    //     itemModelGenerator.register(ModItems.PINK_GARNET_HOE, Models.HANDHELD);

    //     itemModelGenerator.register(ModItems.PINK_GARNET_HAMMER, Models.HANDHELD);

    //     itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_HELMET));
    //     itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_CHESTPLATE));
    //     itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_LEGGINGS));
    //     itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_BOOTS));

    //     itemModelGenerator.register(ModItems.PINK_GARNET_HORSE_ARMOR, Models.GENERATED);
    //     itemModelGenerator.register(ModItems.KAUPEN_SMITHING_TEMPLATE, Models.GENERATED);

    //     itemModelGenerator.register(ModItems.BAR_BRAWL_MUSIC_DISC, Models.GENERATED);

    //     itemModelGenerator.register(ModBlocks.DRIFTWOOD_SAPLING.asItem(), Models.GENERATED);
    }
}