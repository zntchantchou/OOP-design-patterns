package factoryPattern;

import factoryPattern.factory.ItalianIngredientFactory;
import factoryPattern.pizzas.CheesePizza;
import factoryPattern.pizzas.HamPizza;
import factoryPattern.pizzas.PepperoniPizza;
import factoryPattern.pizzas.VeggiePizza;

public class ItalianPizzaStore extends PizzaStore {
	
	public ItalianPizzaStore() {}
	
	// this is the factory method, where concrete classes are instantiated (keyword
	// new)
 
	public Pizza createPizza(String type) {
		ItalianIngredientFactory factory = new ItalianIngredientFactory();
		Pizza pizza = null;
		if (type.equals("Cheese")) {
			pizza = new CheesePizza(factory);
		}
		if (type.contentEquals("Pepperoni")) {
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
