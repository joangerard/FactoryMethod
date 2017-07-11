
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		nyStore.orderPizza("cheese");
		nyStore.orderPizza("veggie");
		nyStore.orderPizza("clam");
		
		chicagoStore.orderPizza("cheese");
		chicagoStore.orderPizza("veggie");
		chicagoStore.orderPizza("clam");
	}

}
