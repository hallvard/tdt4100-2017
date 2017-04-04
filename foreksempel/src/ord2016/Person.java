package ord2016;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Person implements Iterable<Person> {

	private String name;
	private Gender gender;
	private Person mother, father;

	private Collection<Person> children = new ArrayList<>();

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Person getMother() {
		return mother;
	}

	public Person getFather() {
		return father;
	}

	/**
	 * @return the number of children of this Person
	 */
	public int getChildCount() {
		return children.size();
	}

	/**
	 * @param child
	 * @return if this Person has the provided Person as a child
	 */
	public boolean hasChild(Person child) {
		return children.contains(child);
	}

	public Iterator<Person> iterator() {
		return children.iterator();
	}

	/**
	 * Returns all children of this Person with the provided Gender. * If gender
	 * is null, all children are returned. Can be used to get all daughters or
	 * sons of a person.
	 * 
	 * @param gender
	 */
	public Collection<Person> getChildren(Gender gender) {
		// return children.stream().filter((child) -> child.gender ==
		// gender).collect(Collectors.toList());
		Collection<Person> result = new ArrayList<>();
		for (Person child : children) {
			if (child.gender == gender) {
				result.add(child);
			}
		}
		return result;
	}

	/**
	 * Adds the provided Person as a child of this Person. Also sets the child's
	 * father or mother to this Person, depending on this Person's gender. To
	 * ensure consistency, if the provided Person already
	 * has a parent of that gender, it is removed as a child of that parent.
	 * 
	 * @param child
	 */
	public void addChild(Person child) {
		if (this.gender == Gender.MALE && child.father != null) {
			child.father.children.remove(child);
		} else if (this.gender == Gender.FEMALE && child.mother != null) {
			child.mother.children.remove(child);
		}
		children.add(child);
		if (this.gender == Gender.MALE) {
			child.father = this;
		} else if (this.gender == Gender.FEMALE) {
			child.mother = this;
		}
	}
}
