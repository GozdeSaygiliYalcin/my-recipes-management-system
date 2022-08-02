package com.bilgeadam.recipeapp.server.dbo.init;

import java.util.ArrayList;

import com.bilgeadam.recipeapp.server.controller.IngredientController;
import com.bilgeadam.recipeapp.server.dbo.Ingredient;

public class IngredientTest {
	
	public static void main(String[] args) {
		
		IngredientController inCon = new IngredientController();
		ArrayList <Ingredient> allergens = inCon.retrieve();
		System.out.println(allergens.get(0));
	}

}
