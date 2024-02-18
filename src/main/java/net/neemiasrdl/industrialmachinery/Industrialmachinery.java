package net.neemiasrdl.industrialmachinery;

import net.fabricmc.api.ModInitializer;

import net.neemiasrdl.industrialmachinery.item.ModItemGroups;
import net.neemiasrdl.industrialmachinery.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Industrialmachinery implements ModInitializer {

	public static String MOD_ID = "industrialmachinery";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

	}
}