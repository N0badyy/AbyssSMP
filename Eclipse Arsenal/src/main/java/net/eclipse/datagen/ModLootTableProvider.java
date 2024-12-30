package net.eclipse.datagen;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
// import net.life_combat.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // addDrop(ModBlocks.AMETHYST_BRICK_BLOCK);
        // addDrop(ModBlocks.AMETHYST_BRICK_SLAB);
        // addDrop(ModBlocks.AMETHYST_BRICK_STAIR);
        // addDrop(ModBlocks.AMETHYST_SLAB);
        // addDrop(ModBlocks.AMETHYST_STAIR);
        // addDrop(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK);
        // addDrop(ModBlocks.POLISHED_AMETHYST_BRICK_SLAB);
        // addDrop(ModBlocks.POLISHED_AMETHYST_BRICK_STAIRS);
        // addDrop(ModBlocks.POLISHED_AMETHYST_BRICK_WALL);
        // addDrop(ModBlocks.AMETHYST_BRICK_WALL);
        // addDrop(ModBlocks.AMETHYST_WALL);
    }
}
