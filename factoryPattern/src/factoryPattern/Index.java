package factoryPattern;

public class Index {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GermanPizzaStore germanStore = new GermanPizzaStore();
		Pizza pizza1 = germanStore.orderPizza("Frida");
		ItalianPizzaStore italianStore = new ItalianPizzaStore();
		Pizza pizza2 = italianStore.orderPizza("Regina");
	}
}
