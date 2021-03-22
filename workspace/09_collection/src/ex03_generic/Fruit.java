package ex03_generic;

/**
 * @author ITSC
 *
 */
public class Fruit {

	// field
	private String name;
	private int price;

	// constructor
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// method
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]\n";
	}
	
	
	
	
}
