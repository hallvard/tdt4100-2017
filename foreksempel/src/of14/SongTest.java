package of14;

import junit.framework.TestCase;

public class SongTest extends TestCase {
	
	private static String vowels = "aeiouyæøå";
	private static String consonants = "bcdfghjklmnpqrstvwxz";
	
	public void testIsVowel() {
		for (int i = 0; i < vowels.length(); i++) {
			assertTrue(Song.isVowel(vowels.charAt(i)));
		}
		for (int i = 0; i < consonants.length(); i++) {
			assertFalse(Song.isVowel(consonants.charAt(i)));
		}
	}
	
	public void testComputeVerse() {
		assertEquals("Ølføbøt", Song.computeVerse("Alfabet", 'ø'));
	}
	
	public void testWriteSong() {
		Song song = new Song("Alfabet");
		song.writeSong("aeø");
	}
	
	public void testComputeVerseException() {
		try {
			Song.computeVerse("Alfabet", 'g');
			fail();
		} catch (IllegalArgumentException e) {
			// OK, utløse exception, da er det jo greit.
		}
	}
	
	// Oppgave 3b) Forklar med tekst og kode hvordan du vil teste Song-klassen
	// => Samme strategi, utføre kall på Song-objekter i stedet.
}
