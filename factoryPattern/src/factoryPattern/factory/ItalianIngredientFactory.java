package factoryPattern.factory;

import factoryPattern.Ingredient;
import factoryPattern.ingredients.GermanCheese;
import factoryPattern.ingredients.ItalianDough;
import factoryPattern.ingredients.Kraut;
import factoryPattern.ingredients.TomatoSauce;
import factoryPattern.ingredients.WestphalianHam;
import factoryPattern.ingredients.Wurst;

public class ItalianIngredientFactory implements PizzaIngredientFactory{
	
	public Ingredient createSauce() {
		return new TomatoSauce();
	}
	
	public Ingredient createDough() {
		return new ItalianDough();
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
