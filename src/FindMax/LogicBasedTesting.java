package FindMax;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class LogicBasedTesting {
	@Test
    public void P1testT1() {
		int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> {FindMax.findMax(numbers);});
    }

	@Test
	public void P1testT2() {
		int[] numbers = {7};
        assertEquals(7, FindMax.findMax(numbers));
	}
	
	@Test
    public void P2testT1() {
		int[] numbers = {7,8};
        assertEquals(8, FindMax.findMax(numbers));
    }

	@Test
	public void P2testT2() {
		int[] numbers = {7,4};
        assertEquals(7, FindMax.findMax(numbers));
	}
}
