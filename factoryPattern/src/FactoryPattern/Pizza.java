package FactoryPattern;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("-------- Pizza preparation --------");
		System.out.println(String.format("Starting preparation of the %s.", name));
		System.out.println(String.format("Making %s", dough));
		System.out.println(String.format("Spreading %s sauce on top of the pizza", sauce));
		toppings.forEach(topping -> {
			System.out.println(String.format("Adding %s on top of the pizza", topping));
		});
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
		System.out.println(String.format("dough: %s, sauce: %s, toppings: ", dough, sauce));
		toppings.forEach(topping -> {
			System.out.println(topping);
		});
	}
	
	public String getName() {
		return name;
	}
}
