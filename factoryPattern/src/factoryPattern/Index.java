package factoryPattern;

public class Index {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GermanPizzaStore germanStore = new GermanPizzaStore();
		ItalianPizzaStore italianStore = new ItalianPizzaStore();
		Pizza pizza1 = germanStore.orderPizza("Cheese");
		Pizza pizza2 = italianStore.orderPizza("Pepperoni");
		Pizza pizza3 = germanStore.orderPizza("Ham");
		Pizza pizza4 = italianStore.orderPizza("Veggie");
	}
}
