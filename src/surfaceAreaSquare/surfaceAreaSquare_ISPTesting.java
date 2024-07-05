package surfaceAreaSquare;

import static org.junit.Assert.*;

import org.junit.Test;

public class surfaceAreaSquare_ISPTesting {
	
	// Each Choice criterion 
	
	@Test(expected = IllegalArgumentException.class)
	public void ISPTest1() {
		Area.surfaceAreaSquare(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ISPTest2() {
		Area.surfaceAreaSquare(0);
	}
	
	@Test
	public void ISPTest3() {
		assertEquals(1, Area.surfaceAreaSquare(1), 0.1);
	}
	

}
