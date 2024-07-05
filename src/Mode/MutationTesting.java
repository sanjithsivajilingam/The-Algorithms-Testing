package Mode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MutationTesting {
	@Test
    public void CFGtestT1() {
        int[] numbers = {};
        assertNull(Mode.mode(numbers));
    }

	@Test
	public void CFGtestT2() {
		int[] numbers = {7,7,9};
		int[] expectedModes = {7};
	    assertArrayEquals(expectedModes, Mode.mode(numbers));
	}
	
	@Test
	public void CFGtestT3() {
		int[] numbers = {7,7};
		int[] expectedModes = {7};
	    assertArrayEquals(expectedModes, Mode.mode(numbers));
	}
}