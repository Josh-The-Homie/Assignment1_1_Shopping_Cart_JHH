/**
 * Application class that tests all of the methods in cart.
 * 
 * @author Joshua Henderson
 */
public class Application {
	public static void main(String[] args) {
		// Create a shopping cart using ArrayBag<Item>
		ArrayBag<Item> cart = new ArrayBag<Item>();

		// Test getCurrentSize method
		System.out.println("Testing getCurrentSize: Current cart size is " + cart.getCurrentSize());

		// Test isEmpty method
		System.out.println("Testing isEmpty: Cart is empty? " + cart.isEmpty());

		// Add items to the cart with decimal prices
		Item[] itemsToAdd = { new Item("Gallon of milk", 2.79), // Updated price to a decimal value
				new Item("Pack of Batteries", 7.49), // Updated price to a decimal value
				new Item("Toaster", 20.64), // Updated price to a decimal value
				new Item("Elf Maid Poster", 12.49), // Updated price to a decimal value
				new Item("Computer mouse", 20.64), // Updated price to a decimal value
				new Item("Phone Case", 15.45) // Updated price to a decimal value
		};

		for (Item item : itemsToAdd) {
			cart.add(item);
			System.out.println("Added item: " + item.getName());
		}
		// Calculate the total price of items in the cart
		double totalPrice = 0.0;

		for (Item item : cart.toArray()) {
			totalPrice += item.getPrice();
		}

		// Print the total price
		System.out.println("\nTotal Price of Items in the Cart: $" + String.format("%.2f", totalPrice));
		// Print the contents of the cart
		System.out.println("\nPrinting contents of the cart:");
		Item[] cartContents = cart.toArray();
		for (Item item : cartContents) {
			System.out.println(item.getName() + " - $" + String.format("%.2f", item.getPrice())); // Format price with
																									// two decimal
																									// places
		}

		// Test remove method
		System.out.println("\nTesting remove: Removed item: " + cart.remove().getName());

		// Test clear method
		cart.clear();
		System.out.println("\nTesting clear: Cart is cleared. Current cart size is " + cart.getCurrentSize());

		// Add more items to the cart with decimal prices
		Item[] additionalItems = { new Item("New Book", 14.99), // Updated price to a decimal value
				new Item("Headphones", 34.99) // Updated price to a decimal value
		};

		for (Item item : additionalItems) {
			cart.add(item);
			System.out.println("Added item: " + item.getName());
		}

		// Print the contents of the cart again
		System.out.println("\nPrinting contents of the cart after adding more items:");
		cartContents = cart.toArray();
		for (Item item : cartContents) {
			System.out.println(item.getName() + " - $" + String.format("%.2f", item.getPrice())); // Format price with
																									// two decimal
																									// places
		}
		// Remove some items
		System.out.println("\nRemoving items from the cart:");
		for (int i = 0; i < 2; i++) {
			Item removedItem = cart.remove();
			if (removedItem != null) {
				System.out.println("Removed item: " + removedItem.getName());
			} else {
				System.out.println("Cart is empty. No more items to remove.");
			}
		}
	}// end main
}// end application
