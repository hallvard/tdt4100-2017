package ord2016;

import java.util.ArrayList;
import java.util.Collection;

public class Parent implements Relation {

	@Override
	public Collection<Person> getRelativesOf(Person person) {
		Collection<Person> parents = new ArrayList<Person>();
		if (person.getMother() != null) {
			parents.add(person.getMother());
		}
		if (person.getFather() != null) {
			parents.add(person.getFather());
		}
		return parents;
	}
}
