package funksjoner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
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
	}
}
