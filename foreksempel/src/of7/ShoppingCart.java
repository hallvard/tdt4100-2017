package of7;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

	// Ny datastruktur: Map
	// Item (f.eks. Rottmann) peker til ( => ) 5.0
	// Merk: Alle collections er parametrisert over
	// objekt-datatyper
	Map<Item, Double> cart = new HashMap<>();
	
	public void addItemAmount(Item item, double amount){
		if (!cart.containsKey(item)) {
			cart.put(item, amount);
		} else { // "Tingen" finnes allerede i vognen
			cart.put(item, cart.get(item) + amount);
		}
		//if (!item.getShoppingCarts().contains(this)) {
		// Item-klassen sjekker allerede for dette
		item.addShoppingCart(this);
		//}
		
	}
	
	public double getAmount(Item item) {
		if (cart.containsKey(item)) {
			return cart.get(item);
		}
		return 0;
	}
	
	// Regne ut totalpris på en "ting"
	public double getItemCost(Item item) {
		if (cart.containsKey(item)) {
			return cart.get(item)*item.getPrice();
		}
		return 0;
	}
	
	public double getCartCost() {
		double totalCost = 0;
		// cart er en Map som er Iterable
		// Dvs. kan bruke for each-løkke
		for (Item cartItem : cart.keySet()) {
			totalCost += cartItem.getPrice()*cart.get(cartItem);
		}
		return totalCost;
	}
	
	@Override
	public String toString() {
		String cartString = "Handlevogn med følgende varer:";
		for (Item item : cart.keySet()) {
			cartString += "\n" + cart.get(item) + " x " + item.getName() + " = " +
					this.getItemCost(item);
		}
		cartString += "\n\nTotalsum: " + this.getCartCost();
		return cartString;
	}
	
	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart();
		ShoppingCart cart2 = new ShoppingCart();
		
		// Lag noen "ting"
		Item flask = new Item("Flaske", 80);
		Item coat = new Item("Allværsjakke", 150);
		Item membership = new Item("Samfundet-medlemskap", 100);
		Item textBook = new Item("Rottmann", 100);
		Item pants = new Item("Regnbukser", 100);
		
		// Legg til i handlevogn
		cart1.addItemAmount(flask, 2); cart1.addItemAmount(coat, 2);
		cart1.addItemAmount(membership, 3); cart1.addItemAmount(textBook, 5);
		cart2.addItemAmount(coat, 3);
		cart2.addItemAmount(pants, 4);
		
		System.out.println(cart1);
		System.out.println(cart2);
		System.out.println("Allv.jakken er i " + 
				coat.getShoppingCarts().size() + " handlevogner.");
	}
	
	
}
