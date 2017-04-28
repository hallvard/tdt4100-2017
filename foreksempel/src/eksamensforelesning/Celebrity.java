package eksamensforelesning;

import java.util.ArrayList;
import java.util.Collection;

public class Celebrity {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Celebrity(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private String name; 
	private int age; 
	private Collection<Paparazzi> listeners = new ArrayList(); 
	
	public void addListener(Paparazzi p){
		listeners.add(p); 
	}
	public void removeListener(Paparazzi p) {
		
		listeners.remove(p); 
	}
	public void haveBirthday(){
		this.age ++; 
		this.fireBirthDay(); 
	}
	public void fireBirthDay(){
		for(Paparazzi p: listeners){
			p.celebrityHasBirthday(this); 
		}
	}
	
}
