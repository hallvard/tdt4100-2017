package ord2016;

import java.util.ArrayList;
import java.util.Collection;

public class Relation2 implements Relation {

	private final Relation rel1, rel2;
	
	public Relation2(Relation rel1, Relation rel2) {
		this.rel1 = rel1;
		this.rel2 = rel2;
	}

	@Override
	public Collection<Person> getRelativesOf(Person person) {
		Collection<Person> allRelatives = new ArrayList<Person>();
		Collection<Person> relatives = rel1.getRelativesOf(person);
		for (Person relative : relatives) {
			allRelatives.addAll(rel2.getRelativesOf(relative));
		}
		return allRelatives;
	}
	
	public static Relation OLDEFORELDER = new Relation2(new Relation2(new Parent(), new Parent()), new Parent());
}
