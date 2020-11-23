package factoryPattern.pizzas;

import factoryPattern.Pizza;
import factoryPattern.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
	public CheesePizza(PizzaIngredientFactory factory) {
		super(factory);
		name = "Cheese pizza";
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
	}
}
