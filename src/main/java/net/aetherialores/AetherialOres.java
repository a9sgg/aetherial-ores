package net.a9sgg.aetherialores;

import net.a9sgg.aetherialores.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AetherialOres implements ModInitializer {

	public static final String MOD_ID = "aetherial-ores";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[{}] Initializing...", MOD_ID);

		// Register all blocks + block items
		ModBlocks.registerBlocks();

		// Add ore blocks to the "Natural" creative tab
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.add(ModBlocks.AETHERIUM_ORE);
			entries.add(ModBlocks.VOIDSTEEL_ORE);
			entries.add(ModBlocks.CHRONOCITE_ORE);
		});

		// Add refined blocks to the "Building Blocks" creative tab
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.add(ModBlocks.AETHERIUM_BLOCK);
			entries.add(ModBlocks.VOIDSTEEL_BLOCK);
			entries.add(ModBlocks.CHRONOCITE_BLOCK);
		});

		LOGGER.info("[{}] Initialization complete.", MOD_ID);
	}
}
