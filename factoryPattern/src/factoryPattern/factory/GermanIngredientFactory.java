package factoryPattern.factory;

import factoryPattern.Ingredient;
import factoryPattern.ingredients.GermanCheese;
import factoryPattern.ingredients.GermanDough;
import factoryPattern.ingredients.Kraut;
import factoryPattern.ingredients.MayonnaiseSauce;
import factoryPattern.ingredients.WestphalianHam;
import factoryPattern.ingredients.Wurst;

public class GermanIngredientFactory implements PizzaIngredientFactory{
	
	public Ingredient createSauce() {
		return new MayonnaiseSauce();
	}
	
	public Ingredient createDough() {
		return new GermanDough();
	}
	
	public Ingredient createCheese() {
		return new GermanCheese();
	}
	
	public Ingredient createHam() {
		return new WestphalianHam();
	}
	
	public Ingredient createPepperoni() {
		return new Wurst();
	}
	
	public Ingredient[] createVeggies() {
		Ingredient[] germanVeggies = {new Kraut()};
		return germanVeggies;
	}
}
