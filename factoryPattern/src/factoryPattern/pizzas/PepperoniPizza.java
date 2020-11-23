package factoryPattern.pizzas;

import factoryPattern.Pizza;
import factoryPattern.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
	public PepperoniPizza(PizzaIngredientFactory factory) {
		super(factory);
		name = "Pepperoni pizza";
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
		pepperoni = factory.createPepperoni();
	}
}
