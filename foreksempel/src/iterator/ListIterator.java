package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIterator implements Iterator<String> {

	private List<String> stringList;
	private int i = 0;
	
	public ListIterator(List<String> stringList) {
		this.stringList = stringList;
	}
	
	@Override
	public boolean hasNext() {
		return i < stringList.size();
	}

	@Override
	public String next() {
		String string = stringList.get(i);
		i++;
		return string;
	}

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("en", "to", "tre");
		for (int i = 0; i < stringList.size(); i++) {
			String s = stringList.get(i);
			System.out.println(s);
		}

		Iterator<String> it = new ListIterator(stringList);
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
	
}
