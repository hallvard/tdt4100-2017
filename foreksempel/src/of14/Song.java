package of14;

public class Song {
	
	// Oppgave 1a)
	private static String vowels = "aeiouyæøå";
	
	public static boolean isVowel(char c) {
		return vowels.indexOf(Character.toLowerCase(c)) >= 0;
	}
	
	// Oppgave 1b)
	public static String computeVerse(String originalVerse, char v) {
		// Håndtere unntaket med én gang
		if (!isVowel(v)) {
			throw new IllegalArgumentException(v + " er ikke en vokal.");
		}
		String newVerse = "";
		for (int i = 0; i < originalVerse.length(); i++) {
			char c = originalVerse.charAt(i);
			if (!isVowel(c)) {
				newVerse += c;
			} else if (Character.isUpperCase(c)) {
				newVerse += Character.toUpperCase(v);
			} else {
				newVerse += Character.toLowerCase(v);
			}
		}
		return newVerse;
	}
	
//	// Oppgave 1c)
//	public static void writeSong(String originalVerse) {
//		// Skal *skrive* ut, ikke returnere, så Sysout...(...) holder
//		for (int i = 0; i < vowels.length(); i++) {
//			System.out.println(computeVerse(originalVerse, vowels.charAt(i)));
//		}
//	}
	
	// Oppgave 1d)
	String verse;
	public Song(String verse) {
		this.verse = verse;
	}
	
	public void writeSong(String vowelString) {
		for (int i = 0; i < vowelString.length(); i++) {
			//System.out.println(computeVerse(vowelString.charAt(i))); // Kan også gjøre computeVerse ikke-st.
			// Merk at en statisk metode, pr. def, kalles på en klasse og ikke en instans av klassen
			System.out.println(Song.computeVerse(verse, vowelString.charAt(i)));
		}
	}
	
	public static void main(String[] args) {
		Song song = new Song("Alfabet");
		song.writeSong("aeø");
	}
}
