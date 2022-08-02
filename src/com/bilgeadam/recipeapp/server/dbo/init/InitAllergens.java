package com.bilgeadam.recipeapp.server.dbo.init;

import com.bilgeadam.recipeapp.server.controller.EntityController;
import com.bilgeadam.recipeapp.server.dbo.Allergen;


public class InitAllergens {

	public static void main(String[] args) {
		
		EntityController<Allergen> controller = new EntityController<Allergen>();
		
		Allergen e1 = new Allergen("peanut");
		Allergen e2 = new Allergen("Gluten");
		Allergen e3 = new Allergen("Avenin");
		Allergen e4 = new Allergen("Peach");

		controller.create(e1);
		controller.create(e2);
		controller.create(e3);
		controller.create(e4);
	}

}
