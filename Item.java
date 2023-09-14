/**
 * Item class with price.
 * 
 * @author Joshua Henderson
 */
public class Item {
	private String itemName;
	private double Price;

	public Item(String ItemName, double d) {
		itemName = ItemName;
		Price = d;
	}// end constructor

	public String getName() {
		return itemName;
	}// end getName

	public double getPrice() {
		return Price;
	}// end getPrice
}// end Item
