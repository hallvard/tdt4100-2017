package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Person implements Iterable<Person> {

	private Collection<Person> children = new ArrayList<Person>();
	
	public void addChild(Person person) {
		children.add(person);
	}
	
//	public int getChildCount() {
//		return children.size();
//	}
//	
//	public Person getChild(int i) {
//		return children.get(i);
//	}
	
	// implementerer Iterable.iterator()
	public Iterator<Person> iterator() {
		return children.iterator();
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.addChild(new Person());
		person.addChild(new Person());
		person.addChild(new Person());

		for (Person child : person) {
			System.out.println(child);
		}
	}
}
