package com.bilgeadam.recipeapp.server.dbo.init;

import java.util.ArrayList;

import com.bilgeadam.recipeapp.server.controller.AllergenController;
import com.bilgeadam.recipeapp.server.controller.EntityController;
import com.bilgeadam.recipeapp.server.dbo.Allergen;
import com.bilgeadam.recipeapp.server.dbo.Ingredient;

public class InitIngredients {

	public static void main(String[] args) {
		
		EntityController<Ingredient> controller = new EntityController<Ingredient>();
		
		Ingredient i1 = new Ingredient("Rice");
		Ingredient i2 = new Ingredient("Salt");
		Ingredient i3 = new Ingredient("Pepper");
		Ingredient i4 = new Ingredient("Olive Oil");
		Ingredient i5 = new Ingredient("Mince");
		
		AllergenController allergenController = new AllergenController();
		ArrayList<Allergen> allergens = allergenController.retrieve();
		
		i1.addAllergen(allergens.get(0));
		i1.addAllergen(allergens.get(1));
		i1.addAllergen(allergens.get(2));
		
		controller.create(i1);
		controller.create(i2);
		controller.create(i3);
		controller.create(i4);
		controller.create(i5);
		
	}

}
