package factoryPattern.pizzas;

import factoryPattern.Pizza;
import factoryPattern.factory.PizzaIngredientFactory;

public class HamPizza extends Pizza{
		public HamPizza(PizzaIngredientFactory factory) {
			super(factory);
			name = "Ham pizza";
			dough = factory.createDough();
			sauce = factory.createSauce();
			ham = factory.createHam();
			cheese = factory.createCheese();
		}
}
