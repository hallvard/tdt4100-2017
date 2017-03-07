package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

public class PersonReader {

	public Collection<Person> read(InputStream stream) {
		return read(new BufferedReader(new InputStreamReader(stream)));
	}

	public Collection<Person> read(BufferedReader bufferedReader) {
		Collection<Person> persons = new ArrayList<>();
		String line;
		try {
			while ((line = bufferedReader.readLine()) != null) {
				Person person = new Person();
				String[] attributes = line.split(",");
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
		return persons;
	}
	
	public static void main(String[] args) {
		PersonReader personReader = new PersonReader();
		try {
			FileInputStream inputStream = new FileInputStream("/Users/hal/tdt4100/tdt4100-2017-master/git/tdt4100-2017/foreksempel/src/io/persons.txt");
			Collection<Person> persons = personReader.read(inputStream);
			inputStream.close();
			System.out.println(persons);
		} catch (IOException e) {
			System.err.println("Missing file: " + e);
		}
	}
}
