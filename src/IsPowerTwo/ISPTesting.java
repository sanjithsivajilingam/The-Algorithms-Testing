package IsPowerTwo;

import static org.junit.Assert.*;
import org.junit.Test;

public class ISPTesting {

	// Test for even numbers thats negative, positive and zero
	@Test
	public void testIsPowerTwoWithEvenNumbers() {
		assertFalse(IsPowerTwo.isPowerTwo(-4)); // Negative even number
		assertTrue(IsPowerTwo.isPowerTwo(2)); // Positive even number

	}

	// Test for odd numbers
	@Test
	public void testIsPowerTwoWithOddNumbers() {
		assertFalse(IsPowerTwo.isPowerTwo(-3)); // Negative odd number
		assertFalse(IsPowerTwo.isPowerTwo(3)); // Positive odd number

	}

	// Test for zero
	@Test
	public void testIsPowerTwoWithZero() {
		assertFalse(IsPowerTwo.isPowerTwo(0)); // Zero is not a power of two
	}




//We are testing ISP, which is for inputs of  even/odd with <0, >0 and also 0 input
	

}
