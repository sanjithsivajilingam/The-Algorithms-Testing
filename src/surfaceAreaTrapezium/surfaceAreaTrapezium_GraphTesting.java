package surfaceAreaTrapezium;

import static org.junit.Assert.*;

import org.junit.Test;

public class surfaceAreaTrapezium_GraphTesting {

	// Below are the required test cases to cover node, edge, edge pair criterion in addition to data flow criteria.
	
	@Test
	public void graphTest1() {
		assertEquals(12.5, Area.surfaceAreaTrapezium(2, 3, 5), 0.1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void graphTest2() {
		Area.surfaceAreaTrapezium(0, 3, 5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void graphTest3() {
		Area.surfaceAreaTrapezium(3,0,5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void graphTest4() {
		Area.surfaceAreaTrapezium(3,5,0);
	}

}
