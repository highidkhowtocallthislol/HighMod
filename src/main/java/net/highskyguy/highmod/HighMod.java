package net.highskyguy.highmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.highskyguy.highmod.block.ModBlocks;
import net.highskyguy.highmod.block.entity.ModBlockEntities;
import net.highskyguy.highmod.entity.ModEntities;
import net.highskyguy.highmod.entity.custom.PorcupineEntity;
import net.highskyguy.highmod.item.ModItemGroups;
import net.highskyguy.highmod.item.ModItems;
import net.highskyguy.highmod.recipe.ModRecipes;
import net.highskyguy.highmod.screen.ModScreenHandlers;
import net.highskyguy.highmod.sound.ModSounds;
import net.highskyguy.highmod.util.ModCustomTrades;
import net.highskyguy.highmod.util.ModLootTableModifiers;
import net.highskyguy.highmod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HighMod implements ModInitializer {
	public static final String MOD_ID = "highmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// MOD FUNCTIONS

		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();

		ModCustomTrades.registerVillagerTrades();

		ModSounds.registerSounds();

		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());

		ModBlockEntities.registerBlockEntities();

		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.registerRecipes();

		ModWorldGeneration.generateModWorldGen();


		FuelRegistry.INSTANCE.add(ModItems.MY_GYATT, 1728000);

		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_LOG, ModBlocks.STRIPPED_CHESTNUT_LOG);
		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_WOOD, ModBlocks.STRIPPED_CHESTNUT_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_PLANKS, 10, 10);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LEAVES, 100, 100);
	}
}