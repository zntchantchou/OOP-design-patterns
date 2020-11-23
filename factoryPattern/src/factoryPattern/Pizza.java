package factoryPattern;

import factoryPattern.factory.PizzaIngredientFactory;

public abstract class Pizza {
	public String name;
	public Ingredient dough;
	public Ingredient sauce;
	public Ingredient cheese;
	public Ingredient ham;
	public Ingredient pepperoni;
	public Ingredient[] veggies;

	PizzaIngredientFactory factory;
	
	
	public Pizza(PizzaIngredientFactory factory) {
			this.factory = factory;
	}

	
	public void prepare() {
		System.out.println("-------- Pizza preparation --------");
		System.out.println(String.format("Starting preparation of the %s.", name));
		System.out.println(String.format("Making %s", dough.name));
		System.out.println(String.format("Spreading %s sauce on top of the pizza", sauce.name));
	}
	
	public void bake() {
		System.out.println("Baking the pizza");
	}
	
	public void cut() {
		System.out.println("Slicing the pizza");
	}
	
	public void box() {
		System.out.println("Putting the pizza into the box");
	}
	
	public void describe() {
		System.out.println(String.format("dough: %s, sauce: %s: ", dough, sauce));
	}
	
	public String getName() {
		return name;
	}
}
