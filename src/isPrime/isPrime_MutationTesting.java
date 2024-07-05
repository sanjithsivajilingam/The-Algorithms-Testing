package isPrime;

import static org.junit.Assert.*;

import org.junit.Test;

public class isPrime_MutationTesting {

	@Test
	public void mutTest1() {
		assertTrue(PrimeCheck.isPrime(37));
	}
	
	@Test
	public void mutTest2() {
		assertFalse(PrimeCheck.isPrime(9));
	}
	
	@Test
	public void mutTest3() {
		assertTrue(PrimeCheck.isPrime(2));
	}
	
	@Test
	public void mutTest4() {
		assertFalse(PrimeCheck.isPrime(1));
	}
	
	@Test
	public void mutTest5() {
		assertTrue(PrimeCheck.isPrime(5));
	}
	
	@Test
	public void mutTest6() {
		assertFalse(PrimeCheck.isPrime(4));
	}
}
