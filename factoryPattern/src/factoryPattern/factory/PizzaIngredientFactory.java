package factoryPattern.factory;

import factoryPattern.Ingredient;

public interface PizzaIngredientFactory {
	public Ingredient createDough();
	public Ingredient createSauce();
	public Ingredient[] createVeggies();
	public Ingredient createCheese();
	public Ingredient createPepperoni();
	public Ingredient createHam();
}
