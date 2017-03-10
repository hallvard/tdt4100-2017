package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringIterator implements Iterator<Character> {

	private String string;
	private int i = 0;
	
	public StringIterator(String string) {
		this.string = string;
	}
	
	@Override
	public boolean hasNext() {
		return i < string.length();
	}

	@Override
	public Character next() {
		Character c = string.charAt(i);
		i++;
		return c;
	}

	public static void main(String[] args) {
		String string = "123";
		for (int i = 0; i < string.length(); i++) {
			Character c = string.charAt(i);
			System.out.println(c);
		}

		Iterator<Character> it = new StringIterator("123");
		while (it.hasNext()) {
			Character c = it.next();
			System.out.println(c);
		}
	}
}
