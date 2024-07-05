package Average;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;


public class LogicBasedTesting {
	@Test
    public void P1testT1() {
		 int[] numbers = {};
	     assertThrows(IllegalArgumentException.class, () -> {Average.average(numbers);});
    }

	@Test
	public void P1testT2() {
	    int[] numbers = {7};
        assertEquals(7, Average.average(numbers));
	}
	
	@Test
    public void P1ClausetestT1() {
	    int[] numbers = {7};
        assertEquals(7, Average.average(numbers));
    }

	@Test
	public void P1ClausetestT2() {
		 int[] numbers = {};
	     assertThrows(IllegalArgumentException.class, () -> {Average.average(numbers);});
	}
	
	@Test
	public void P1ClausetestT3() {
	     int[] numbers = null;
	     assertThrows(IllegalArgumentException.class, () -> {Average.average(numbers);});
	}
}
