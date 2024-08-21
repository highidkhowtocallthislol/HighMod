package net.highskyguy.highmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
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
	}
}