package Average;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class MutationTesting {
	@Test
    public void CFGtestT1() {
		 int[] numbers = {};
	     assertThrows(IllegalArgumentException.class, () -> {Average.average(numbers);});
    }
	
	@Test
	    public void testAverageWithNullInput() {
	        int[] numbers = null;
	        assertThrows(IllegalArgumentException.class, () -> {Average.average(numbers);});
	    }
	
	@Test
    public void P1ClausetestT1() {
	    int[] numbers = {7};
        assertEquals(7, Average.average(numbers));
    }
	
	@Test
	public void CFGtestT2() {
	    int[] numbers = {10,7};
        assertEquals(8, Average.average(numbers));
	}
	
	@Test
    public void testAverageWithNonEmptyInput() {
        int[] numbers = {10, 20, 30, 40, 50};
        assertEquals(30, Average.average(numbers));
    }
}