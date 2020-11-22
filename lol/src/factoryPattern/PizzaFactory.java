package factortyPattern;

public class PizzaFactory {
	Pizza pizza = null;
	
	public Pizza createPizza(String type) {
		if(type == "Frida") {
			pizza = new FridaPizza();
		}
		if(type == "Veggie") {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
