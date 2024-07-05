package surfaceAreaSquare;

import static org.junit.Assert.*;

import org.junit.Test;

public class surfaceAreaSquare_MutationTesting {

	@Test
	public void mutTest1() {
		assertEquals(49, Area.surfaceAreaSquare(7), 0.1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void mutTest2() {
		Area.surfaceAreaSquare(0);
	}
}
