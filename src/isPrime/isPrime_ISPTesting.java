package isPrime;

import static org.junit.Assert.*;
import org.junit.Test;


public class isPrime_ISPTesting {

	// Using "Each-choice" Coverage
	
	@Test
	public void ISPTest1() {
		// Even and Less than Zero
		assertFalse(PrimeCheck.isPrime(-2));
	}
	
	@Test
	public void ISPTest2() {
		// Equal to Zero
		assertFalse(PrimeCheck.isPrime(0));
	}
		
	@Test
	public void ISPTest3() {
		// Odd and Greater than Zero
		assertTrue(PrimeCheck.isPrime(3));
	}

}
