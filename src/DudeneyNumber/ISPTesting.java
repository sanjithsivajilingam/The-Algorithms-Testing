package DudeneyNumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ISPTesting {

    // Test cases for input being a perfect cube
    @Test
    public void NotDundenyNumber() {
        assertFalse(DudeneyNumber.isDudeney(27)); // 3^3 = 27, sum of digits = 2+7 = 9
        assertFalse(DudeneyNumber.isDudeney(64)); // 4^3 = 64, sum of digits = 6+4 = 10
        assertFalse(DudeneyNumber.isDudeney(125)); // 5^3 = 125, sum of digits = 1+2+5 = 8
       
    }


    // Test cases for input not being a perfect cube
    @Test
    public void IsDundenyNumber() {
    	assertTrue(DudeneyNumber.isDudeney(1)); // 5^3 = 125, sum of digits = 1+2+5 = 8
    }

    // Test cases for different signs of the number
    @Test
    public void testSignOfNumber() {
    	assertFalse(DudeneyNumber.isDudeney(-27));
    	assertFalse(DudeneyNumber.isDudeney(-1));

    }
}
