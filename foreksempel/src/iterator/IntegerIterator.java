package iterator;

import java.util.Iterator;

public class IntegerIterator implements Iterator<Integer> {

	int i, end;
	public IntegerIterator(int start, int end) {
		i = start;
		this.end = end;
	}

	@Override
	public boolean hasNext() {
		return i <= end;
	}

	@Override
	public Integer next() {
		int next = i;
		i++;
		return next;
	}
	
	public static void main(String[] args) {
		Iterator<Integer> it = new IntegerIterator(2, 5);
		while (it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}
	}
}
