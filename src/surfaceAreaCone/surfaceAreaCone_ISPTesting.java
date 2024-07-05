package surfaceAreaCone;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class surfaceAreaCone_ISPTesting {
	
	// Using "Each-choice coverage" 
	
	@Test(expected = IllegalArgumentException.class)
	public void ISPTest1() {
		Area.surfaceAreaCone(-1, -1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ISPTest2() {
		Area.surfaceAreaCone(0, 0);
	}
	
	@Test
	public void ISPTest3() {
		assertEquals(7.58, Area.surfaceAreaCone(1, 1), 0.1);
	}

}
