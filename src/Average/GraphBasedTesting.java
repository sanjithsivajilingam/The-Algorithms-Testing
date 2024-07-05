package Average;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class GraphBasedTesting {
	@Test
    public void CFGtestT1() {
		 int[] numbers = {};
	     assertThrows(IllegalArgumentException.class, () -> {Average.average(numbers);});
    }

	@Test
	public void CFGtestT2() {
	    int[] numbers = {10,7};
        assertEquals(8, Average.average(numbers));
	}
	
	@Test
	public void DFGtestT1() {
		  int[] numbers = {10 ,7};
	      assertEquals(8, Average.average(numbers));
	}
}