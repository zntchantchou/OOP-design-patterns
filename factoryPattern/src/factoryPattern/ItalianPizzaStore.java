package factoryPattern;


public class ItalianPizzaStore extends PizzaStore{
	public ItalianPizzaStore() {}

	
	// this is the factory method, where concrete classes are instantiated (keyword new)
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("Regina")) {
			pizza = new ReginaPizza();
		}
		if(type.contentEquals("Margarita")) {
			pizza = new MargaritaPizza();
		}
		return pizza;
	}
}
