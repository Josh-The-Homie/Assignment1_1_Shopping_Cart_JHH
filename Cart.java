/**
 * Shopping cart class for an online store.
 * This class provides a wrapper for managing a collection of items using an ArrayBag.
 * 
 * @author Joshua Henderson
 * @param <T> The type of items to be stored in the cart.
 */
public class Cart {
    ArrayBag<Item> cart = new ArrayBag<Item>(20);

    /**
     * Gets the current number of items in the cart.
     * 
     * @return The current number of items in the cart.
     */
    public int getCurrentSize() {
        return cart.getCurrentSize();
    }

    /**
     * Checks if the cart is empty.
     * 
     * @return True if the cart is empty, false otherwise.
     */
    public boolean isEmpty() {
        return cart.isEmpty();
    }

    /**
     * Adds an item to the cart.
     * 
     * @param newEntry The item to be added to the cart.
     * @return True if the addition is successful, false if the cart is full.
     */
    public boolean add(Item newEntry) {
        return cart.add(newEntry);
    }

    /**
     * Removes and returns an item from the cart.
     * 
     * @return The removed item, or null if the cart is empty.
     */
    public Item remove() {
        return cart.remove();
    }

    /**
     * Removes an item at a specific index from the cart.
     * 
     * @param givenIndex The index of the item to be removed.
     * @return The removed item, or null if the index is out of bounds.
     */
    public Item remove(int givenIndex) {
        return cart.removeEntry(givenIndex);
    }

    /**
     * Clears all items from the cart.
     */
    public void clear() {
        cart.clear();
    }

    /**
     * Gets the frequency (number of occurrences) of a specific item in the cart.
     * 
     * @param a The item to be counted.
     * @return The number of times the item appears in the cart.
     */
    public int getFrequencyOf(Item a) {
        return cart.getFrequencyOf(a);
    }

    /**
     * Checks if the cart contains a specific item.
     * 
     * @param anEntry The item to be checked for existence in the cart.
     * @return True if the item is found in the cart, false otherwise.
     */
    public boolean contains(Item anEntry) {
        return cart.contains(anEntry);
    }

    /**
     * Gets the index of a specific item in the cart.
     * 
     * @param anEntry The item to find the index of.
     * @return The index of the item in the cart, or -1 if not found.
     */
    public int getIndexOf(Item anEntry) {
        return cart.getIndexOf(anEntry);
    }

    /**
     * Checks if the cart's underlying array is full.
     * 
     * @return True if the cart's array is full, false otherwise.
     */
    public boolean isArrayFull() {
        return cart.isArrayFull();
    }

    /**
     * Converts the contents of the cart into an array of items.
     * 
     * @return An array containing the items in the cart.
     */
    public Item[] toArray() {
        return cart.toArray();
    }
}
