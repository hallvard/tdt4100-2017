package average;

public class Average {

	// to objekt-variabler (også kalt attributer eller felt)
	
	// int er typen for heltall, så valueCount kan bare bli satt til heltall 
	int valueCount = 0;
	// double er typen for desimaltall, så sum kan bare bli satt til desimaltall
	// (heltall blir konvertert, om nødvendig)
	double sum = 0.0;

	// metodedeklarasjon, void betyr at metoden ikke returnerer noe
	void acceptValue(double value) {
		// legg value til sum (og oppdater sum)
		sum = sum + value;
		// legg 1 til valueCount (og oppdater valueCount)
		valueCount = valueCount + 1;
	}
	
	// metodedeklarasjon, returnerer en double, altså et desimaltall
	double getAverage() {
		// returner resultatet av beregningen, double delt på int blir en double
		return sum / valueCount;
	}
}
