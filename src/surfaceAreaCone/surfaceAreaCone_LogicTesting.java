package surfaceAreaCone;

import static org.junit.Assert.*;

import org.junit.Test;

public class surfaceAreaCone_LogicTesting {

	// Below tests are for achieving Predicate Coverage of Predicate #1: radius <= 0
	@Test(expected = IllegalArgumentException.class)
	public void LogicTest1() {
		Area.surfaceAreaCone(0, 2);
	}
	
	@Test
	public void LogicTest2() {
		assertEquals(30.34, Area.surfaceAreaCone(2, 2), 0.1);
	}
	
	// Below tests are for achieving Predicate Coverage of Predicate #2: height <= 0
	@Test(expected = IllegalArgumentException.class)
	public void LogicTest3() {
		Area.surfaceAreaCone(2,0);
	}
	
	@Test
	public void LogicTest4() {
		assertEquals(30.34, Area.surfaceAreaCone(2, 2), 0.1);
	}

}
