package Floor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class LogicBasedTesting {
	@Test
    public void P1testT1() {
		 double number = 4.0;
	     assertEquals(4.0, Floor.floor(number), 0.0001);
    }

	@Test
	public void P1testT2() {
		 double number = 4.4;
	     assertEquals(4.0, Floor.floor(number), 0.0001);
	}
	
	@Test
    public void P2testT1() {
		 double number = 4.4;
	     assertEquals(4.0, Floor.floor(number), 0.0001);
    }

	@Test
	public void P2testT2() {
		double number = 4.8;
	    assertEquals(4.0, Floor.floor(number), 0.0001);
	}
}
