package eksamensforelesningPart2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SamfundetArbeider implements Comparable<SamfundetArbeider>, Iterable<String> {

	public Integer age;
	public String name;
	public String cardNumber;
	public List<String> keys;
	
	public SamfundetArbeider(int age, String name, String cardNumber){
		this.age = age;
		this.name = name;
		this.cardNumber = cardNumber;
		this.keys = Arrays.asList("key1", "key3", "key2");
	}
	
	@Override
	public String toString() {
		return name + " " + age.toString() + " " + cardNumber; 
	}
	
	public static void main(String[] args) {
		SamfundetArbeider samf1 = new SamfundetArbeider(56, "Hallvard", "234-12341324-1234");
		SamfundetArbeider samf2 = new SamfundetArbeider(23, "Marit", "824-12341324-1234");
		SamfundetArbeider samf3 = new SamfundetArbeider(67, "Jens", "2234-12341324-1234");
		
		List<SamfundetArbeider> list = Arrays.asList(samf1, samf2, samf3);

		System.out.println(list);
		//Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
		for(SamfundetArbeider samf: list){
			System.out.println(samf);
			if(samf.age >= 30){
				
			}
		}
		//list.stream().forEach((arbeider) -> System.out.println(arbeider));
		List<Integer> alderListe;
		int sumAlder = list
				.stream()
				.filter(arbeider -> arbeider.age >= 30)
				//.filter(arbeider -> arbeider.name.equals("Jens"))
				.mapToInt(arbeider -> arbeider.age)
				.sum();
		System.out.println(sumAlder);
		
		
		
		/*Iterator<String> keyIterator = samf1.iterator();
		while(keyIterator.hasNext()){
			System.out.println(keyIterator.next());
		}*/
		
	}

	@Override
	public int compareTo(SamfundetArbeider samf2) {
		return this.name.compareTo(samf2.name);
	}

	@Override
	public Iterator<String> iterator() {
		return this.keys.iterator();
	}
	
	public void skriveMotereferat(){
		System.out.println("Gabriel er awesome! Skrevet av " + this.name);
	}
	
}
