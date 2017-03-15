package of10;

import junit.framework.TestCase;

public class RobberLanguageTest extends TestCase {

	RobberLanguage rl;
	
	public void setUp() {
		// Kjøres hver gang en test kjøres
		rl = new RobberLanguage();
		System.out.println("Setter opp test..");
	}
	
	public void testEncryptInRobberLanguage() {
		String inString = "Hei";
		String result = rl.encryptInRobberLanguage(inString);
		// alle *test*-funksjoner starter med assert...
		assertEquals(result, "Hohei");
	}
	
	public void test2() {
		String hei = "Hei";
		assertFalse(hei.equals("Hei"));
	}
	
	public void tearDown() {
		// Kjøres *etter* at en test har kjørt
		rl = null;
		System.out.println("Avslutter test...");
	}
	
}
