package of8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart implements Iterable<Item> {

	List<Item> items = new ArrayList<>();
	
	public void add(Item item) {
		items.add(item);
	}
	public Item getItem(int index) {
		return items.get(index);
	}
	public int cartSize() {
		return items.size();
	}
	public String toString() {
		String cartString = "";
		for (Item item : items) {
			cartString += item.getName() + "\n";
		}
		return cartString;
	}
	@Override
	public Iterator<Item> iterator() {
		return new ShoppingCartIterator(this);
	}
	
}
