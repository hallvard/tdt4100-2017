package eksamensforelesningPart2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorProgram {

	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("En", "To", "Tre", "Fire");
		
		Iterator<String> iterator = new StringIterator(list);
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		Iterator<String> sortedIterator = new SortedStringIterator(list);
		
		while(sortedIterator.hasNext()){
			System.out.println(sortedIterator.next());
		}
	}
}
