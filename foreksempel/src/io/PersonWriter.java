package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;

public class PersonWriter {

	private Collection<Person> persons = new ArrayList<Person>();
	
	public void addPerson(Person person) {
		this.persons.add(person);
	}
	
	public void write(OutputStream stream) {
		write(new OutputStreamWriter(stream));
	}

	public void write(Writer writer) {
		write(new PrintWriter(writer));
	}

	public void write(PrintWriter writer) {
		for (Person person : persons) {
			writer.printf("name:%s, email:%s\n", person.getName(), person.getEmail());
		}
		writer.close();
	}
	
	public static void main(String[] args) {
		PersonWriter personWriter = new PersonWriter();
		Person hal = new Person();
		hal.setName("Hallvard Traetteberg");
		hal.setEmail("hallvard.traetteberg@ntnu.no");
		Person marit = new Person();
		marit.setName("Marit Reitan");
		marit.setEmail("marit.reitan@ntnu.no");
		personWriter.addPerson(hal);
		personWriter.addPerson(marit);
		try {
			personWriter.write(new FileWriter("/Users/hal/tdt4100/tdt4100-2017-master/git/tdt4100-2017/foreksempel/src/io/persons.txt"));
		} catch (IOException e) {
			System.err.println("Exception when writing persons: " + e);
		}
		// 
	}
}
