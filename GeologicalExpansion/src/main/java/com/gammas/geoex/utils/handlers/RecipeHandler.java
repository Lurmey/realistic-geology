package com.gammas.geoex.utils.handlers;

import com.gammas.geoc.api.RecipeHolder;
import com.gammas.geoex.init.ItemInit;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipeHandler {
	
	private static final RecipeHandler INSTANCE = new RecipeHandler();
	
	public static RecipeHandler getInstance() {
		return INSTANCE;
	}
	
	public static void addRecipes() {
		
		RecipeHolder.addCrushingRecipe(new ItemStack(ItemInit.BANDED_IRON_CHUNK, 1), new ItemStack(ItemInit.BANDED_IRON_CRUSHED, 1));
		RecipeHolder.addCrushingRecipe(new ItemStack(ItemInit.LIMESTONE_CHUNK, 1), new ItemStack(ItemInit.LIMESTONE_CRUSHED, 1));
		RecipeHolder.addCrushingRecipe(new ItemStack(Items.COAL, 1, 1), new ItemStack(ItemInit.CHARCOAL_CRUSHED));
		
		RecipeHolder.addPanningRecipe(new ItemStack(ItemInit.BANDED_IRON_CRUSHED, 4), new ItemStack(ItemInit.BANDED_IRON_SEPERATED, 2));
		
	}

}
