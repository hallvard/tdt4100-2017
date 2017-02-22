package of7;

import java.util.ArrayList;
import java.util.Collection;

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

public class Item {

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

}
