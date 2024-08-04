package net.highskyguy.highmod;

import net.fabricmc.api.ModInitializer;

import net.highskyguy.highmod.block.ModBlocks;
import net.highskyguy.highmod.item.ModItemGroups;
import net.highskyguy.highmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HighMod implements ModInitializer {
	public static final String MOD_ID = "highmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// MOD FUNCTIONS

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}