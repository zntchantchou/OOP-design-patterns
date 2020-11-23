package factoryPattern;

import factoryPattern.factory.GermanIngredientFactory;
import factoryPattern.pizzas.CheesePizza;
import factoryPattern.pizzas.HamPizza;
import factoryPattern.pizzas.PepperoniPizza;
import factoryPattern.pizzas.VeggiePizza;

public class GermanPizzaStore extends PizzaStore {

	public GermanPizzaStore() {}

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		GermanIngredientFactory factory = new GermanIngredientFactory();
		
		if(type.equals("Cheese")) {
			pizza = new CheesePizza(factory);
		}
		if(type.equals("Pepperoni")){
			pizza = new PepperoniPizza(factory);
		}
		if(type.equals("Veggie")) {
			pizza = new VeggiePizza(factory);
		}
		if(type.equals("Ham")){
			pizza = new HamPizza(factory);
		}
		return pizza;
	}
	
}

