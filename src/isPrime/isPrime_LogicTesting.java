package isPrime;

import static org.junit.Assert.*;

import org.junit.Test;

public class isPrime_LogicTesting {
	
	
	// Below tests are for achieving Predicate Coverage for Predicate #1: (n == 2)
	
	@Test
	public void LogicTest1() {
		assertTrue(PrimeCheck.isPrime(2));
	}
	
	@Test
	public void LogicTest2() {
		assertTrue(PrimeCheck.isPrime(3));
	}
	
	// Below tests are for achieving Predicate Coverage for Predicate #2: (n < 2 || n % 2 == 0)
	
	@Test
	public void LogicTest3() {
		assertFalse(PrimeCheck.isPrime(1));
	}
	
	@Test
	public void LogicTest4() {
		assertTrue(PrimeCheck.isPrime(5));
	}
	
	// Below tests are for achieving Predicate Coverage for Predicate #3: (n % i == 0)
	
	@Test
	public void LogicTest5() {
		assertTrue(PrimeCheck.isPrime(7));
	}
	
	@Test
	public void LogicTest6() {
		assertFalse(PrimeCheck.isPrime(9));
	}
	
	// Below tests are for achieving clause coverage for (n < 2 || n % 2 == 0) which is (a v b)
	
	@Test
	public void LogicTest7() {
		assertTrue(PrimeCheck.isPrime(7));
	}
	
	@Test
	public void LogicTest8() {
		assertFalse(PrimeCheck.isPrime(0));
	}
	
	
	
	
}
