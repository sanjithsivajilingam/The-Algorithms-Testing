package surfaceAreaTrapezium;

import static org.junit.Assert.*;

import org.junit.Test;

public class surfaceAreaTrapezium_LogicTesting {

	// Below Tests are for achieving Logic Coverage for Predicate P1 = base1 <= 0
	@Test(expected = IllegalArgumentException.class)
	public void LogicTest1() {
		Area.surfaceAreaTrapezium(0, 3, 5);
	}
	
	@Test
	public void LogicTest2() {
		assertEquals(20,Area.surfaceAreaTrapezium(5, 3, 5), 0.1);
	}
	
	// Below Tests are for achieving Logic Coverage for Predicate P2 = base2 <= 0
	@Test(expected = IllegalArgumentException.class)
	public void LogicTest3() {
		Area.surfaceAreaTrapezium(3, 0, 5);
	}
	
	@Test
	public void LogicTest4() {
		assertEquals(25,Area.surfaceAreaTrapezium(3,7,5), 0.1);
	}
	
	// Below Tests are for achieving Logic Coverage for Predicate P3 = height <= 0
	@Test(expected = IllegalArgumentException.class)
	public void LogicTest5() {
		Area.surfaceAreaTrapezium(3,5,0);
	}
	
	@Test
	public void LogicTest6() {
		assertEquals(40,Area.surfaceAreaTrapezium(3,5,10), 0.1);
	}
}
