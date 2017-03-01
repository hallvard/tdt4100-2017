package of8;

import java.util.Iterator;
import java.util.stream.Collectors;

public class CartProgram {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		cart.add(new Item("Big Java", 800));
		cart.add(new Item("Tekna-flaske", 50));
		cart.add(new Item("Samfundet-medlemskap", 1000));
		cart.add(new Item("Allværsjakke", 150));
		cart.add(new Item("Rottmann", 250));
		
		/*
		 * Viser gyldige løkkekonstruksjoner
		 */
		for (Iterator<Item> cartIterator = new ShoppingCartIterator(cart); cartIterator.hasNext(); ) {
			System.out.println(cartIterator.next());
		}
		
		Iterator<Item> cartIterator = new ShoppingCartIterator(cart);
		while (cartIterator.hasNext()) {
			System.out.println(cartIterator.next());
		}
		
		for (Item item : cart) {
			System.out.println(item);
		}
		
		/*
		 * Nå: Løkke gjennom vha. ShoppingCartFilteringIterator
		 */
		Iterator<Item> cartIterator2 = new ShoppingCartIterator(cart);
		double maxPrice = 200;
		System.out.println("Bruk av en meta-iterator: ShoppingCartFilteringIterator");
		Iterator<Item> it = new ShoppingCartFilteringIterator(cartIterator2, 
																maxPrice);
		while(it.hasNext()) {
			Item item = it.next();
			if (item != null) {
				System.out.println(item);
			}
		}
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		
	}
	
	
	
}