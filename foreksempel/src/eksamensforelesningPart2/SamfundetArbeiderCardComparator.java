package eksamensforelesningPart2;

import java.util.Comparator;

public class SamfundetArbeiderCardComparator implements Comparator<SamfundetArbeider>{

	@Override
	public int compare(SamfundetArbeider samf1, SamfundetArbeider samf2) {
		return samf1.cardNumber.compareTo(samf2.cardNumber);
	}

}
