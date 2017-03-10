package iterator;

import java.util.Iterator;

public class DividableByThreeFilteringIterator implements Iterator<Integer> {
	
	private Iterator<Integer> it;
	private Integer next;
	
	public DividableByThreeFilteringIterator(Iterator<Integer> it) {
		this.it = it;
		wind();
	}

	private boolean acceptInteger(int i) {
		return (i % 3) == 0;
	}
	
	private void wind() {
		while (it.hasNext()) {
			next = it.next();
			if (acceptInteger(next)) {
				return;
			}
		}
		next = null;
	}
	
	@Override
	public boolean hasNext() {
		return next != null;
	}
	
	@Override
	public Integer next() {
		int next = this.next;
		wind();
		return next;
	}
	
	public static void main(String[] args) {
		Iterator<Integer> it1 = new IntegerIterator(1, 10);
		Iterator<Integer> it2 = new DividableByThreeFilteringIterator(it1);
		Iterator<Integer> it3 = new SkipNIteratorIterator(it2, 1);
		while (it3.hasNext()) {
			Integer i = it3.next();
			System.out.println(i);
		}
	}
}
