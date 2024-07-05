package Floor;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MutationTesting {
	@Test
    public void CFGtestT1() {
	    double number = 4.0;
        assertEquals(4.0, Floor.floor(number), 0.0001);
    }

	@Test
	public void CFGtestT2() {
	    double number = 4.4;
        assertEquals(4.0, Floor.floor(number), 0.0001);
	}
	
	@Test
	public void CFGtestT3() {
		double number = 4.8;
	    assertEquals(4.0, Floor.floor(number), 0.0001);
	}
}