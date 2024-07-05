package DudeneyNumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LogicBasedTesting {

    // Test cases for Predicate P1: (cube_root * cube_root * cube_root != n)
    @Test
    public void testPredicateP1_False() {
        assertFalse(DudeneyNumber.isDudeney(5)); // Not a perfect cube
    }

    @Test
    public void testPredicateP1_True() {
        assertTrue(DudeneyNumber.isDudeney(1)); // perfect cube
    }

    // Test cases for Predicate P2: (temp > 0)
    @Test
    public void testPredicateP2_True() {
        assertTrue(DudeneyNumber.isDudeney(1)); // temp = 1, > 0
    }

    @Test
    public void testPredicateP2_False() {
        assertFalse(DudeneyNumber.isDudeney(-1)); // temp = 0, not > 0
    }
}
