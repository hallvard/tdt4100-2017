package of8;

import java.util.Iterator;

public class ShoppingCartFilteringIterator implements Iterator<Item> {

	/*
	 * Holder en ShoppingCartIterator, filtrerer basert på pris.
	 */
	
	private Iterator<Item> it1;
	private double maxPrice;
	
	public ShoppingCartFilteringIterator(Iterator<Item> it1,
			double maxPrice) {
		this.it1 = it1;
		this.maxPrice = maxPrice;
	}

	@Override
	public boolean hasNext() {
		// Om én av de to iteratorene har flere elementer,
		// så kan vi gi ut flere av disse.
		return (it1.hasNext());
	}

	@Override
	public Item next() {
		// Sjekk om it1 har flere elementer, hvis ja, gi et element videre
		// hvis det tilfredsstiller filtreringskravet.
		while (it1.hasNext()) {
			Item item = it1.next();
			if (item.getPrice() <= maxPrice) {
				return item;
			}
		} return null;
	}
	
}
