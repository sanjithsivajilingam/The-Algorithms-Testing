package surfaceAreaTrapezium;

import static org.junit.Assert.*;

import org.junit.Test;

public class surfaceAreaTrapezium_ISPTesting {
	
	// Each-choice criterion will be used 
	
	@Test(expected = IllegalArgumentException.class)
	public void ISPTest1() {
		Area.surfaceAreaTrapezium(-1, -1, -1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ISPTest2() {
		Area.surfaceAreaTrapezium(0, 0, 0);
	}
	
	@Test
	public void ISPTest3() {
		assertEquals(1, Area.surfaceAreaTrapezium(1, 1, 1), 0.1);
	}

}
