package iterator;

import java.util.Iterator;

public class SkipNIteratorIterator implements Iterator<Integer> {
	
	int skip;
	private Iterator<Integer> it;
	
	public SkipNIteratorIterator(Iterator<Integer> it, int skip) {
		this.it = it;
		this.skip = skip;
	}

	@Override
	public boolean hasNext() {
		return it.hasNext();
	}

	@Override
	public Integer next() {
		Integer next = it.next();
		for (int i = 0; i < skip; i++) {
			if (it.hasNext()) {
				it.next();
			}
		}
		return next;
	}
	
	public static void main(String[] args) {
		Iterator<Integer> it1 = new IntegerIterator(1, 10);
		Iterator<Integer> it2 = new SkipNIteratorIterator(it1, 1);
		Iterator<Integer> it3 = new SkipNIteratorIterator(it2, 1);
		while (it3.hasNext()) {
			Integer i = it3.next();
			System.out.println(i);
		}
	}
}
