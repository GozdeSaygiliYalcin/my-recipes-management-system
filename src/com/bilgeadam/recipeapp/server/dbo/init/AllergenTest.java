package com.bilgeadam.recipeapp.server.dbo.init;

import java.util.ArrayList;

import com.bilgeadam.recipeapp.server.controller.AllergenController;
import com.bilgeadam.recipeapp.server.dbo.Allergen;

public class AllergenTest {
	
	public static void main(String[] args) {
		
		AllergenController alCon = new AllergenController();
		ArrayList <Allergen> allergens = alCon.retrieve();
		System.out.println(allergens);
		
	}

}
