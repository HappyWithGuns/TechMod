package net.happy.techmod;

import net.fabricmc.api.ModInitializer;

import net.happy.techmod.block.ModBlocks;
import net.happy.techmod.item.ModItemGroups;
import net.happy.techmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TechMod implements ModInitializer {
	public static final String MOD_ID = "techmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();
	}
}