package factoryPattern;


public class GermanPizzaStore extends PizzaStore {

	public GermanPizzaStore() {}

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("Veggie")) {
			pizza = new VeggiePizza();
		}
		if(type.equals("Frida")){
			pizza = new FridaPizza();
		}
		return pizza;
	}
	
}

