package surfaceAreaCone;

import static org.junit.Assert.*;

import org.junit.Test;

public class surfaceAreaCone_MutationTesting {

	@Test
	public void mutTest1() {
		assertEquals(30.34 , Area.surfaceAreaCone(2,2), 0.1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void mutTest2() {
		Area.surfaceAreaCone(0,2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void mutTest3() {
		Area.surfaceAreaCone(2,0);
	}
}