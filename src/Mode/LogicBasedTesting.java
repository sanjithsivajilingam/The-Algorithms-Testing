package Mode;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class LogicBasedTesting {
	@Test
    public void P1testT1() {
        int[] numbers = {};
        assertNull(Mode.mode(numbers));
    }

	@Test
	public void P1testT2() {
		int[] numbers = {7};
		int[] expectedModes = {7};
	    assertArrayEquals(expectedModes, Mode.mode(numbers));
	}
	
	@Test
    public void P2testT1() {
		int[] numbers = {7,7};
		int[] expectedModes = {7};
	    assertArrayEquals(expectedModes, Mode.mode(numbers));
    }

	@Test
	public void P2testT2() {
		int[] numbers = {7,9};
		int[] expectedModes = {7,9};
	    assertArrayEquals(expectedModes, Mode.mode(numbers));
	}
	
	@Test
    public void P3testT1() {
		int[] numbers = {7};
		int[] expectedModes = {7};
	    assertArrayEquals(expectedModes, Mode.mode(numbers));
    }

	@Test
	public void P3testT2() {
		int[] numbers = {7,7,9};
		int[] expectedModes = {7};
	    assertArrayEquals(expectedModes, Mode.mode(numbers));
	}
}