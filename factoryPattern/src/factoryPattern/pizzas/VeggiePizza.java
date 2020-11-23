package factoryPattern.pizzas;

import factoryPattern.Pizza;
import factoryPattern.factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza{
	public VeggiePizza(PizzaIngredientFactory factory) {
		super(factory);
		name = "Veggie pizza";
		dough = factory.createDough();
		sauce = factory.createSauce();
		veggies = factory.createVeggies();
		cheese = factory.createCheese();
	}
}
