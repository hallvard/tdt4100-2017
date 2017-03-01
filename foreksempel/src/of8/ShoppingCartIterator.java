package of8;

import java.util.Iterator;

public class ShoppingCartIterator implements Iterator<Item> {

	public ShoppingCart cart;
	int index = 0;
	
	public ShoppingCartIterator(ShoppingCart cart) {
		this.cart = cart;
	}
	
	@Override
	public boolean hasNext() {
		return index < this.cart.cartSize();
	}

	@Override
	public Item next() {
		Item nextItem = this.cart.getItem(index);
		index++; // index = index + 1
		return nextItem;
	}

}
