package eksamensforelesningPart2;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	Account account;
	
	@Before
	public void before() {
		account = new Account(300, 1.5);
	}
	
	@Test
	public void test() {
		assertEquals(account.amount, 300);
	}
	
	@Test
	public void testInterest() {
		assertEquals(account.interest, 1.5, 0.000004);
	}
	
	@After
	public void after() {
		
	}

}
