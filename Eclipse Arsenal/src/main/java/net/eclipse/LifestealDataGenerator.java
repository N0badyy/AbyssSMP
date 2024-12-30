package net.eclipse;

import net.eclipse.datagen.ModBlockTagProvider;
import net.eclipse.datagen.ModEnchantmentTagProvider;
import net.eclipse.datagen.ModItemTagProvider;
import net.eclipse.datagen.ModLootTableProvider;
import net.eclipse.datagen.ModModelProvider;
import net.eclipse.datagen.ModRecipeProvider;
import net.eclipse.datagen.ModRegistryDataGenerator;
import net.eclipse.enchantment.ModEnchantments;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class LifestealDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModEnchantmentTagProvider::new);
	}
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		
		registryBuilder.addRegistry(RegistryKeys.ENCHANTMENT, ModEnchantments::bootstrap);

		
	}
}
