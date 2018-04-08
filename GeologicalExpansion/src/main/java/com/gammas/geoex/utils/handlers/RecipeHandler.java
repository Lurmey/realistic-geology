package com.gammas.geoex.utils.handlers;

import com.gammas.geoc.api.RecipeHolder;
import com.gammas.geoex.init.ItemInit;

import net.minecraft.item.ItemStack;

public class RecipeHandler {
	
	private static final RecipeHandler INSTANCE = new RecipeHandler();
	
	public static RecipeHandler getInstance() {
		return INSTANCE;
	}
	
	public static void addRecipes() {
		
		RecipeHolder.addCrushingRecipe(new ItemStack(ItemInit.BANDED_IRON_CHUNK, 1), new ItemStack(ItemInit.BANDED_IRON_DUST, 1));
		
		RecipeHolder.addPanningRecipe(new ItemStack(ItemInit.BANDED_IRON_DUST, 4), new ItemStack(ItemInit.CRUDE_IRON_DUST, 2));
		
	}

}