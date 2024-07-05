package Upper;

import static org.junit.Assert.*;
import org.junit.Test;

public class LogicBasedTesting {

	// Test for Predicate P1
	@Test
	public void testPredicateP1() {
		assertNull(Upper.toUpperCase(null)); // P1 = True, empty or null
		assertEquals("ABC", Upper.toUpperCase("ABC")); // P1 = False, not null and not empty
	}

	// Test for Predicate P2
	@Test
	public void testPredicateP2() {
		// P2 = True
		assertTrue(Upper.toUpperCase("a").equals("A")); // P2 = True, letter and lowercase
		// P2 = False
		assertEquals("123", Upper.toUpperCase("123")); // P2 = False, input that is not letter nor uppercase

	}

	/*
	 * Test case for Clauses C1 and C2 (C1) = (s == null ) Clause (C2) = (s
	 * =="".equals(s))
	 * 
	 */
	@Test
	public void testClausesC1C2_1() {
		// Test for Clause C1
		assertNull(Upper.toUpperCase(null)); // C1 = True, C2 = True
		assertEquals("NOTEMPTY", Upper.toUpperCase("notempty")); // C1 = True, C2 = False
		assertEquals("HELLO", Upper.toUpperCase("Hello")); // C1 = False, C2 = True
		assertEquals("ABC", Upper.toUpperCase("abc")); // C1 = False, C2 = False

	}

	/*
	 * Test case for Clauses C1 and C2 Clause (C1) = Character.isLetter(values[i])
	 * Clause (C2) = CharacterisLowerCase(values[i])
	 * 
	 */
	@Test
	public void testClausesC1C2_2() {

		assertEquals("HELLO", Upper.toUpperCase("hello")); // C1 = True, C2 = True
		assertEquals("HELLO", Upper.toUpperCase("HELLO")); // C1 = True, C2 = False
		assertEquals("HELLO1234", Upper.toUpperCase("hello1234")); // C1 = False, C2 = True

		assertEquals("1234", Upper.toUpperCase("1234")); // C1 = False, C2 = False
	}

}
