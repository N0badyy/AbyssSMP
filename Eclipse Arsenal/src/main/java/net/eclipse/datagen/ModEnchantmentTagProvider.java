package net.eclipse.datagen;


import net.eclipse.enchantment.ModEnchantments;
import net.eclipse.tags.ModEnchantmentTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EnchantmentTags;

import java.util.concurrent.CompletableFuture;

public class ModEnchantmentTagProvider extends FabricTagProvider.EnchantmentTagProvider {
    public ModEnchantmentTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ModEnchantmentTags.CUSTOM_EXCLUSIVE_SET).add(ModEnchantments.FROSTBITE).add(ModEnchantments.GRAPPLING);
        getOrCreateTagBuilder(ModEnchantmentTags.ELEMENT_EXCLUSIVE_SET).add(ModEnchantments.FROSTBITE).add(Enchantments.FIRE_ASPECT);
        getOrCreateTagBuilder(ModEnchantmentTags.VELOCITY_MODIFER).add(ModEnchantments.GRAPPLING).add(Enchantments.KNOCKBACK);
        getOrCreateTagBuilder(EnchantmentTags.IN_ENCHANTING_TABLE).add(ModEnchantments.GRAPPLING).add(ModEnchantments.FROSTBITE);
        
        
    }
}