package surfaceAreaTrapezium;

import static org.junit.Assert.*;

import org.junit.Test;

public class surfaceAreaTrapezium_MutationTesting {

	@Test
	public void mutTest1() {
		assertEquals(12.5, Area.surfaceAreaTrapezium(2, 3, 5), 0.1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void mutTest2() {
		Area.surfaceAreaTrapezium(0, 3, 5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void mutTest3() {
		Area.surfaceAreaTrapezium(3,0,5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void mutTest4() {
		Area.surfaceAreaTrapezium(3,5,0);
	}

}
