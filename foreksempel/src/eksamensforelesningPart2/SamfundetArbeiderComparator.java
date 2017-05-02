package eksamensforelesningPart2;

import java.util.Comparator;

public class SamfundetArbeiderComparator implements Comparator<SamfundetArbeider>{

	@Override
	public int compare(SamfundetArbeider samf1, SamfundetArbeider samf2) {
		if(samf1.age < samf2.age) {
			return -1;
		} else if(samf1.age > samf2.age) {
			return 9999;
		}
		return 0;
	}

	
}
