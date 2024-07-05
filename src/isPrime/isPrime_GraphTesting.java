package isPrime;

import static org.junit.Assert.*;

import org.junit.Test;

public class isPrime_GraphTesting {

	// Below are the the required test cases for covering node,edge, and edge pair coverage criterion in addition to data flow criteria.
	
	@Test
	public void graphTest1() {
		assertTrue(PrimeCheck.isPrime(37));
	}
	
	@Test
	public void graphTest2() {
		assertFalse(PrimeCheck.isPrime(9));
	}
	
	@Test
	public void graphTest3() {
		assertTrue(PrimeCheck.isPrime(2));
	}
	
	@Test
	public void graphTest4() {
		assertFalse(PrimeCheck.isPrime(1));
	}
	
	@Test
	public void graphTest5() {
		assertTrue(PrimeCheck.isPrime(5));
	}
	
	
	
	
	
	
	
	
	
	

}
