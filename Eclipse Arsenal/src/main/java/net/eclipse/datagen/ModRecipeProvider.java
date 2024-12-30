package net.eclipse.datagen;

import net.eclipse.item.ModItems;
// your package
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;

import net.minecraft.item.Items;

import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;



import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        

        
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SCYTHE_HANDLE, 1)
                 .pattern(" RN")
                 .pattern(" NS")
                 .pattern("S  ")
                 .input('R', Items.REDSTONE)
                 .input('N', Items.NETHERITE_INGOT)
                 .input('S', Items.STICK)
                 .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                 .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                 .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                 .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SCYTHE_ITEM, 1)
                 .pattern("NID")
                 .pattern(" H ")
                 .pattern("S  ")
                 .input('I', Items.IRON_INGOT)
                 .input('D', Items.DIAMOND)
                 .input('H', ModItems.SCYTHE_HANDLE)
                 .input('N', Items.NETHERITE_INGOT)
                 .input('S', Items.STICK)
                 .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                 .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                 .criterion(hasItem(ModItems.SCYTHE_HANDLE), conditionsFromItem(ModItems.SCYTHE_HANDLE))
                 .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                 .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                 .offerTo(exporter);

        // ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK, 4)
        //         .pattern("RR")
        //         .pattern("RR")
                
        //         .input('R', ModBlocks.AMETHYST_BRICK_BLOCK)
        //         .criterion(hasItem(ModBlocks.AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.AMETHYST_BRICK_BLOCK))
        //         .offerTo(exporter);

        // ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AMETHYST_BRICK_STAIR, 4)
        //         .pattern("R  ")
        //         .pattern("RR ")
        //         .pattern("RRR")
        //         .input('R', ModBlocks.AMETHYST_BRICK_BLOCK)
        //         .criterion(hasItem(ModBlocks.AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.AMETHYST_BRICK_BLOCK))
        //         .offerTo(exporter);
        // ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AMETHYST_STAIR, 4)
        //         .pattern("R  ")
        //         .pattern("RR ")
        //         .pattern("RRR")
        //         .input('R', Blocks.AMETHYST_BLOCK)
        //         .criterion(hasItem(Blocks.AMETHYST_BLOCK), conditionsFromItem(Blocks.AMETHYST_BLOCK))
        //         .offerTo(exporter);
        // ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_AMETHYST_BRICK_STAIRS, 4)
        //         .pattern("R  ")
        //         .pattern("RR ")
        //         .pattern("RRR")
        //         .input('R', ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK)
        //         .criterion(hasItem(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK))
        //         .offerTo(exporter);


        // ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AMETHYST_BRICK_SLAB, 6)
        //         .pattern("RRR")
                
        //         .input('R', ModBlocks.AMETHYST_BRICK_BLOCK)
        //         .criterion(hasItem(ModBlocks.AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.AMETHYST_BRICK_BLOCK))
        //         .offerTo(exporter);
        // ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_AMETHYST_BRICK_SLAB, 6)
        //         .pattern("RRR")
                
        //         .input('R', ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK)
        //         .criterion(hasItem(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK))
        //         .offerTo(exporter);
        // ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AMETHYST_SLAB, 6)
        //         .pattern("RRR")
                
        //         .input('R', Blocks.AMETHYST_BLOCK)
        //         .criterion(hasItem(Blocks.AMETHYST_BLOCK), conditionsFromItem(Blocks.AMETHYST_BLOCK))
        //         .offerTo(exporter);
        // ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AMETHYST_WALL, 6)
        //         .pattern("RRR")
        //         .pattern("RRR")
        //         .input('R', Blocks.AMETHYST_BLOCK)
        //         .criterion(hasItem(Blocks.AMETHYST_BLOCK), conditionsFromItem(Blocks.AMETHYST_BLOCK))
        //         .offerTo(exporter);
        
        
        
        // ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AMETHYST_BRICK_WALL, 6)
        //         .pattern("RRR")
        //         .pattern("RRR")
        //         .input('R', ModBlocks.AMETHYST_BRICK_BLOCK)
        //         .criterion(hasItem(ModBlocks.AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.AMETHYST_BRICK_BLOCK))
        //         .offerTo(exporter);
        
        
        // ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_AMETHYST_BRICK_WALL, 6)
        //         .pattern("RRR")
        //         .pattern("RRR")
        //         .input('R', ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK)
        //         .criterion(hasItem(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK))
        //         .offerTo(exporter);
        // StonecuttingRecipeJsonBuilder.createStonecutting(
        //                 Ingredient.ofItems(ModBlocks.AMETHYST_BRICK_BLOCK), // Wrap the block with Ingredient.of()
        //                 RecipeCategory.MISC,
        //                 ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK,
        //                 1
        //                 ).criterion(hasItem(ModBlocks.AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.AMETHYST_BRICK_BLOCK)).offerTo(exporter, "polished_amethyst_from_amethyst_block");;
        // StonecuttingRecipeJsonBuilder.createStonecutting(
        //                         Ingredient.ofItems(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK), // Wrap the block with Ingredient.of()
        //                         RecipeCategory.MISC,
        //                         ModBlocks.POLISHED_AMETHYST_BRICK_SLAB,
        //                         2
        //                         ).criterion(hasItem(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK)).offerTo(exporter, "polished_amethyst_slab_from_polished_amethyst_stonecutting");
        // StonecuttingRecipeJsonBuilder.createStonecutting(
        //                                 Ingredient.ofItems(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK), // Wrap the block with Ingredient.of()
        //                                 RecipeCategory.MISC,
        //                                 ModBlocks.POLISHED_AMETHYST_BRICK_STAIRS,
        //                                 1
        //                                 ).criterion(hasItem(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK)).offerTo(exporter, "polished_amethyst_stairs_from_polished_amethyst_stonecutting");
        // StonecuttingRecipeJsonBuilder.createStonecutting(
        //                                         Ingredient.ofItems(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK), // Wrap the block with Ingredient.of()
        //                                         RecipeCategory.MISC,
        //                                         ModBlocks.POLISHED_AMETHYST_BRICK_WALL,
        //                                         1
        //                                         ).criterion(hasItem(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.POLISHED_AMETHYST_BRICK_BLOCK)).offerTo(exporter, "polished_amethyst_wall_from_polished_amethyst_stonecutting");
        // StonecuttingRecipeJsonBuilder.createStonecutting(
        //                         Ingredient.ofItems(Blocks.AMETHYST_BLOCK), // Wrap the block with Ingredient.of()
        //                         RecipeCategory.MISC,
        //                         ModBlocks.AMETHYST_BRICK_BLOCK,
        //                         1
        //                         ).criterion(hasItem(Blocks.AMETHYST_BLOCK), conditionsFromItem(Blocks.AMETHYST_BLOCK)).offerTo(exporter, "amethyst_brick_block_from_amethst_block_stonecutting");
        // StonecuttingRecipeJsonBuilder.createStonecutting(
        //                                 Ingredient.ofItems(Blocks.AMETHYST_BLOCK), // Wrap the block with Ingredient.of()
        //                                 RecipeCategory.MISC,
        //                                 ModBlocks.AMETHYST_STAIR,
        //                                 1
        //                                 ).criterion(hasItem(Blocks.AMETHYST_BLOCK), conditionsFromItem(Blocks.AMETHYST_BLOCK)).offerTo(exporter, "amethyst_stairs_from_amethst_block_stonecutting");
        // StonecuttingRecipeJsonBuilder.createStonecutting(
        //                                         Ingredient.ofItems(Blocks.AMETHYST_BLOCK), // Wrap the block with Ingredient.of()
        //                                         RecipeCategory.MISC,
        //                                         ModBlocks.AMETHYST_SLAB,
        //                                         2
        //                                         ).criterion(hasItem(Blocks.AMETHYST_BLOCK), conditionsFromItem(Blocks.AMETHYST_BLOCK)).offerTo(exporter, "amethyst_slab_from_amethst_block_stonecutting");;
        // StonecuttingRecipeJsonBuilder.createStonecutting(
        //                                                 Ingredient.ofItems(Blocks.AMETHYST_BLOCK), // Wrap the block with Ingredient.of()
        //                                                 RecipeCategory.MISC,
        //                                                 ModBlocks.AMETHYST_WALL,
        //                                                 1
        //                                                 ).criterion(hasItem(Blocks.AMETHYST_BLOCK), conditionsFromItem(Blocks.AMETHYST_BLOCK)).offerTo(exporter, "amethyst_wall_from_amethst_block_stonecutting");
        // StonecuttingRecipeJsonBuilder.createStonecutting(
        // Ingredient.ofItems(ModBlocks.AMETHYST_BRICK_BLOCK), // Wrap the block with Ingredient.of()
        // RecipeCategory.MISC,
        // ModBlocks.AMETHYST_BRICK_SLAB,
        // 2
        // ).criterion(hasItem(ModBlocks.AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.AMETHYST_BRICK_BLOCK)).offerTo(exporter, "amethyst_bricks_slab_from_amethst_bricks_block_stonecutting");
        
        // StonecuttingRecipeJsonBuilder.createStonecutting(
        // Ingredient.ofItems(ModBlocks.AMETHYST_BRICK_BLOCK), // Wrap the block with Ingredient.of()
        // RecipeCategory.MISC,
        // ModBlocks.AMETHYST_BRICK_STAIR,
        // 1
        // ).criterion(hasItem(ModBlocks.AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.AMETHYST_BRICK_BLOCK)).offerTo(exporter, "amethyst_bricks_stairs_from_amethst_bricks_block_stonecutting");
        // StonecuttingRecipeJsonBuilder.createStonecutting(
        // Ingredient.ofItems(ModBlocks.AMETHYST_BRICK_BLOCK), // Wrap the block with Ingredient.of()
        // RecipeCategory.MISC,
        // ModBlocks.AMETHYST_BRICK_WALL,
        // 1
        // ).criterion(hasItem(ModBlocks.AMETHYST_BRICK_BLOCK), conditionsFromItem(ModBlocks.AMETHYST_BRICK_BLOCK)).offerTo(exporter, "amethyst_bricks_wall_from_amethst_bricks_block_stonecutting");


        }
        
}