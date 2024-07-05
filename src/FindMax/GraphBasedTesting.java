package FindMax;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class GraphBasedTesting {
	@Test
    public void CFGtestT1() {
		int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> {FindMax.findMax(numbers);});
    }

	@Test
	public void CFGtestT2() {
		int[] numbers = {10};
        assertEquals(10, FindMax.findMax(numbers));
	}
	
	@Test
	public void CFGtestT3() {
		int[] numbers = {10,11};
        assertEquals(11, FindMax.findMax(numbers));
	}
	
	@Test
	public void CFGtestT4() {
		int[] numbers = {10,11,9,8};
        assertEquals(11, FindMax.findMax(numbers));
	}

	@Test
	public void DFGtestT1() {
		int[] numbers = {10,11};
        assertEquals(11, FindMax.findMax(numbers));
	}
}
