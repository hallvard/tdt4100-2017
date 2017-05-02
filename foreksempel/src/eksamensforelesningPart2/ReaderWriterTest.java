package eksamensforelesningPart2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReaderWriterTest {

	
	@Before
	public void before() {
		System.out.println("Hello world!");
	}
	@Test
	public void test() {
		assertEquals(5, 5);
	}
	@Test
	public void test2() {
		assertEquals(5, 5);
		System.out.println("Failed!");
	}

}
