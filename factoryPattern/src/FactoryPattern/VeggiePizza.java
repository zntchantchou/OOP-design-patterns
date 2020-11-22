package FactoryPattern;

public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		name = "Veggie";
		dough = "Thin and lightly oiled";
		sauce = "water";
		toppings.add("Chili");
		toppings.add("Peppers");
		toppings.add("Eggs");
		toppings.add("Mozzarella");
	}
}

