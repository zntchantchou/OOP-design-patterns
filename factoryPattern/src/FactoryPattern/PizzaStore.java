package FactoryPattern;

public abstract class PizzaStore {
	public PizzaStore() {

	}
	
	public Pizza orderPizza(String type) {
		// this method (createPizza) has no idea what classes will be instantiated, because the createPizza method is implemented in subclasses
		// in other words, object creation is "decoupled" from this class
		// this enforces the principle: "code to an interface, not an implementation";
		Pizza pizza = createPizza(type);
		pizza.prepare();
		System.out.println("-------- baking, cutting, boxing --------");
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	 abstract Pizza createPizza(String type);
}

