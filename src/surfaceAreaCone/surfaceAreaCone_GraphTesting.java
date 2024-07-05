package surfaceAreaCone;

import static org.junit.Assert.*;

import org.junit.Test;

public class surfaceAreaCone_GraphTesting {
	
	// Below are the required test cases to cover node, edge, edge pair criterion in addition to data flow criteria.
	
	@Test
	public void graphTest1() {
		assertEquals(30.34 , Area.surfaceAreaCone(2,2), 0.1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void graphTest2() {
		Area.surfaceAreaCone(0,2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void graphTest3() {
		Area.surfaceAreaCone(2,0);
	}

}
