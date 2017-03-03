package interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSorter {

	public void sort(List<String> list, StringComparer comparer) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = list.size() - 1; j > i; j--) {
				String s1 = list.get(j - 1), s2 = list.get(j);
				if (comparer.lessThan(s2, s1)) {
					list.set(j, s1);
					list.set(j - 1, s2);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		StringSorter stringSorter = new StringSorter();
		StringComparer comparer = new StringLengthComparer();
		List<String> names = new ArrayList<String>(Arrays.asList(
				"marit", "anne", "jens", "hallvard"
		));
		stringSorter.sort(names, new StringComparerInverter(comparer));
		System.out.println(names);
	}
}
