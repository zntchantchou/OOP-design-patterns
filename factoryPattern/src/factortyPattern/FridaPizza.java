package factortyPattern;

public class FridaPizza extends Pizza {
	public FridaPizza(){
		name = "Frida";
		sauce = "Mayonnaise";
		dough = "Thick beer flavoured dough";
		toppings.add("Curry Wurst");
		toppings.add("Schnitzel");
		toppings.add("Kartofel Salad");
		toppings.add("Extra mayonnaise");
	}
	
	public void cut() {
		System.out.println("Cutting pizza in square slices");
	}
}
