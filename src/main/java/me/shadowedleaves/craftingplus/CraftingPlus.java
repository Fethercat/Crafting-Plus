package me.shadowedleaves.craftingplus;

import me.shadowedleaves.craftingplus.datagen.ModRecipeProvider;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CraftingPlus implements ModInitializer {
	public static final String MOD_ID = "craftingplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModRecipeProvider.registerModRecipes();
	}
}