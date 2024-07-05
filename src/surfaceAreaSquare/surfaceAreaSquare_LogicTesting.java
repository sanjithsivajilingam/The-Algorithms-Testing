package surfaceAreaSquare;

import static org.junit.Assert.*;

import org.junit.Test;

public class surfaceAreaSquare_LogicTesting {

	@Test(expected = IllegalArgumentException.class)
	public void LogicTest1() {
		Area.surfaceAreaSquare(0);
	}
	
	@Test
	public void LogicTest2() {
		assertEquals(100,Area.surfaceAreaSquare(10), 0.1);
	}

}
