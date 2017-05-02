package eksamensforelesningPart2;

import java.util.Iterator;
import java.util.List;

public class StringIterator implements Iterator<String> {

	private List<String> list;
	private int index = 0;
	
	public StringIterator(List<String> list){
		this.list = list;
	}
	
	@Override
	public boolean hasNext() {
		if(this.list.size() > this.index) {
			return true;
		} else {
			return false;
		}
		// Kortere versjon:
		// return this.list.size() > this.index;
	}

	@Override
	public String next() {
		String returnString = this.list.get(this.index);
		this.index = this.index + 1;
		return returnString;
		
		// Kortere versjon:
		// return this.list.get(this.index++);
	}
	
	
}
