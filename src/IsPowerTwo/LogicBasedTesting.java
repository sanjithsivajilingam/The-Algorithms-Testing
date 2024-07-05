package IsPowerTwo; 
import static org.junit.Assert.*;
import org.junit.Test;

public class LogicBasedTesting {

    // Test case for t1: number = -5, Expected Result: False
    @Test
    public void testNegativeNumber() {
        assertFalse(IsPowerTwo.isPowerTwo(-5));
    }

    // Test case for t2: number = 2, Expected Result: True
    @Test
    public void testPositiveNonPowerOfTwo() {
        assertTrue(IsPowerTwo.isPowerTwo(2));
    }
}
