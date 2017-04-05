package ord2016;

import java.util.Collection;
import java.util.HashSet;

public class Sibling implements Relation {

	private final Gender gender;

	public Sibling(Gender gender) {
		this.gender = gender;
	}

	@Override
	public Collection<Person> getRelativesOf(Person person) {
		Collection<Person> brothers = new HashSet<Person>();
		if (person.getMother() != null) {
			brothers.addAll(person.getMother().getChildren(gender));
		}
		if (person.getFather() != null) {
			brothers.addAll(person.getFather().getChildren(gender));
		}
		brothers.remove(person);
		return brothers;
	}
	
	public final static Relation SISTER = new Sibling(Gender.FEMALE);
	public final static Relation BROTHER = new Sibling(Gender.MALE);
	
	public final static Relation daughter = (person) ->  person.getChildren(Gender.FEMALE);
}
