package of8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 @startuml
 Class Item {
 	-String name
 	-double price
 	-Collection<ShoppingCarts> shoppingCarts
 	+String getName()
 }
 Item "1:n" <-- "0:n" ShoppingCart : contains
 Class ShoppingCart {
 	-Map<Item, Double> cart
 	+ void addItemAmount(Item item, double amount)
 	+ double getCartCost()
 }
 @enduml
 */

public class Item implements Comparable<Item> {

	private String name;
	private double price;
	private Collection<ShoppingCart> shoppingCarts;
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
		this.shoppingCarts = new ArrayList<>();
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public void addShoppingCart(ShoppingCart sh) {
		if (!shoppingCarts.contains(sh)) {
			shoppingCarts.add(sh);
		}
	}
	
	public Collection<ShoppingCart> getShoppingCarts() {
		return shoppingCarts;
	}

	@Override
	public String toString() {
		return name + ", til den nette sum av " + price + ".";
	}

	@Override
	public int compareTo(Item o) {
		return (int) (this.price - o.price); // Merk: Casting (synkende: neg. fortegn)
	}
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart(); //Igjen: List er et grensesnitt, ArrayList er en kl.
		
		cart.add(new Item("Big Java", 800));
		cart.add(new Item("Tekna-flaske", 50));
		cart.add(new Item("Samfundet-medl.", 75));
		cart.add(new Item("Allværsjakke", 150));
		
		// Løkke over h.vognen
		Iterator<Item> cartIterator = new ShoppingCartIterator(cart);
		while(cartIterator.hasNext()) {
			Item item = cartIterator.next();
			if (item != null) {
				System.out.println(item.name);
			}
		}
		
		// Fordi ShoppingCart implements Iterable<Item>
		for (Item item : cart) {
		 	System.out.println("For each-løkken gir ut: " + item.name);
		 }
		
		
		// Demo av comparable
		List<Item> cartList = new ArrayList<>();
		cartList.add(new Item("Big Java", 800));
		cartList.add(new Item("Tekna-flaske", 50));
		cartList.add(new Item("Samfundet-medl.", 75));
		cartList.add(new Item("Allværsjakke", 150));
		
		Collections.sort(cartList); // Stigende rekkefølge
		for (Item i : cartList) {
			System.out.println(i.name + " koster " + i.price);
		}
	}

}
