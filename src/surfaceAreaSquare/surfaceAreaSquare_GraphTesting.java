package surfaceAreaSquare;

import static org.junit.Assert.*;

import org.junit.Test;

public class surfaceAreaSquare_GraphTesting {
	
	// Below are the required test cases to cover node, edge, edge pair criterion in addition to data flow criteria.
	@Test
	public void graphTest1() {
		assertEquals(49, Area.surfaceAreaSquare(7), 0.1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void graphTest2() {
		Area.surfaceAreaSquare(0);
	}

}
