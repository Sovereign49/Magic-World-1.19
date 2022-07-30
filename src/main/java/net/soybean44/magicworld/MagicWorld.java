package net.soybean44.magicworld;

import net.fabricmc.api.ModInitializer;
import net.soybean44.magicworld.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicWorld implements ModInitializer {
	public static final String MOD_ID = "magicworld";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
