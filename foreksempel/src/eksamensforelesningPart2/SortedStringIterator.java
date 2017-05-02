package eksamensforelesningPart2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortedStringIterator implements Iterator<String> {

	private List<String> list;
	private int index = 0;
	
	public SortedStringIterator(List<String> list){
		// Copy the contents of list into a temporary list
		ArrayList<String> tempList = new ArrayList<String>(list);
		// Sort the new list
		Collections.sort(tempList);
		// Use the temporary list for the iterator
		this.list = tempList;
	}
	
	@Override
	public boolean hasNext() {
		if(this.list.size() > this.index) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String next() {
		String returnString = this.list.get(this.index);
		this.index = this.index + 1;
		return returnString;
	}
	
	
}
