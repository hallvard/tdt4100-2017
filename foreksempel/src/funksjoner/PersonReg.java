package funksjoner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;
import java.util.function.Predicate;

public class PersonReg {

	private Collection<Person> persons = new ArrayList<>();
	
	public void load(InputStream stream) {
		load(new BufferedReader(new InputStreamReader(stream)));
	}

	private DateFormat dateFormat = DateFormat.getDateInstance();
	
	public void load(BufferedReader bufferedReader) {
		String line;
		try {
			while ((line = bufferedReader.readLine()) != null) {
				Person person = new Person();
				String[] attributes = line.split(";");
				for (int i = 0; i < attributes.length; i++) {
					try {
						String attr = attributes[i].trim();
						int pos = attr.indexOf(':');
						if (pos > 0) {
							String attrName = attr.substring(0, pos).trim();
							String attrValue = attr.substring(pos + 1).trim();
							if (attrName.equals("name")) {
								person.setName(attrValue);
							} else if (attrName.equals("email")) {
								person.setEmail(attrValue);
							} else if (attrName.equals("gender")) {
								person.setGender(attrValue.charAt(0));
							} else if (attrName.equals("birthday")) {
								person.setBirthday(dateFormat.parse(attrValue));
							}
						}
					} catch (Exception e) {
						System.err.println("Illegal attribute format: " + line);
					}
				}
				persons.add(person);
			}
		} catch (IOException e) {
			System.err.println("Exception while reading");
		}
	}
	
	public Person findFirst(Predicate<Person> tester) {
		for (Person person : persons) {
			if (tester.test(person)) {
				return person;
			}
		}
		return null;
	}

	public Collection<Person> findAll(Predicate<Person> tester) {
		Collection<Person> result = new ArrayList<>();
		for (Person person : persons) {
			if (tester.test(person)) {
				result.add(person);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		PersonReg personReg = new PersonReg();
		try (InputStream inputStream = PersonReg.class.getResourceAsStream("persons.txt")) {
			personReg.load(inputStream);
			
		} catch (IOException e) {
		}
		System.out.println(personReg.findFirst(new GivenNameTester("Kari")));
		System.out.println(personReg.findAll(new NtnuMailTester()));
		System.out.println(personReg.findAll((t) -> {
			String email = t.getEmail();
			return (email != null && email.endsWith("@ntnu.no"));
		}));
		System.out.println(personReg.findAll(Person::isFemale));
		
		// hvor mange kvinner er i registeret
		System.out.println(personReg.persons.stream().filter(Person::isFemale).count());
		// hvor langt er det lengste navnet
		System.out.println(personReg.persons.stream().map(Person::getName).map(String::length).max((n1, n2) -> n1 - n2).get());
		System.out.println(personReg.persons.stream().map(Person::getName).map(String::length).max(Comparator.naturalOrder()).get());
		// hvor mange ulike domenenavn finnes det i e-postadressene
		System.out.println(personReg.persons.stream().map(Person::getEmail).filter((email) -> email != null).map((email) -> email.substring(email.lastIndexOf('@'))).distinct().count());
		System.out.println(personReg.persons.stream().map(Person::getEmail).filter(Objects::nonNull).map((email) -> email.substring(email.lastIndexOf('@'))).distinct().count());
		// finnes det noen som er født på 60-tallet
		System.out.println(personReg.persons.stream().anyMatch((p) -> {
			Date birthday = p.getBirthday();
			return birthday != null && birthday.getYear() >= 60 && birthday.getYear() <= 69;
		}));
		System.out.println(personReg.persons.stream().map(Person::getBirthday).filter(Objects::nonNull).map(Date::getYear).anyMatch((y) -> y >= 60 && y <= 69));
	}
}
