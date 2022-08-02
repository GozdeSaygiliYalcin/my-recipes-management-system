package com.bilgeadam.recipeapp.server.dbo;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "allergens")
@NoArgsConstructor
@Getter
public class Allergen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column( name = "oid")
	private long oid;
	@Setter
	private String name;
	
	private byte[] symbol;
	
	@ManyToMany(mappedBy = "allergens")
	private Collection<Ingredient> ingredients = new HashSet<>();
	
	public Allergen (String name) {
		this.name = name;
		this.symbol = null;
	}
	
	public Collection<Ingredient> getIngredients() {
		return this.ingredients;
	}
	
	public void addIngredient(Ingredient ingredient) {
		this.ingredients.add(ingredient);
	}

	@Override
	public String toString() {
		
		String retVal =  "Allergen [oid=" + this.oid + ", name=" + this.name + ", symbol=" + Arrays.toString(this.symbol)
				+ ", ingredients=[\n";
		
		Iterator<Ingredient> iter = this.ingredients.iterator();
		while (iter.hasNext()) {
			Ingredient ingredient = iter.next(); 
			retVal += 	ingredient.getOid() + " - " + ingredient.getName() + "\n";
		}
		
		return retVal + "]\n]";
	}
}
