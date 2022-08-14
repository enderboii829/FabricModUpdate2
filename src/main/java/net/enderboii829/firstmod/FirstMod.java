package net.enderboii829.firstmod;

import net.enderboii829.firstmod.block.ModBlocks;
import net.enderboii829.firstmod.item.ModItems;
import net.enderboii829.firstmod.painting.ModPaintings;
import net.enderboii829.firstmod.util.ModLootTableModifiers;
import net.enderboii829.firstmod.villager.ModVillagers;
import net.enderboii829.firstmod.world.feautures.ModConfigedFeatures;
import net.enderboii829.firstmod.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfigedFeatures.registerConfigedFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();

		ModPaintings.registerPaintings();
		ModOreGeneration.generateOres();

		ModLootTableModifiers.modifyLootTables();


	}
}
