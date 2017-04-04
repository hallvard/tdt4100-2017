package ord2016;

import java.util.Collection;
import java.util.HashSet;

public class Sister implements Relation {

	@Override
	public Collection<Person> getRelativesOf(Person person) {
		Collection<Person> sisters = new HashSet<Person>();
		if (person.getMother() != null) {
			sisters.addAll(person.getMother().getChildren(Gender.FEMALE));
		}
		if (person.getFather() != null) {
			sisters.addAll(person.getFather().getChildren(Gender.FEMALE));
		}
		sisters.remove(person);
		return sisters;
	}
}
