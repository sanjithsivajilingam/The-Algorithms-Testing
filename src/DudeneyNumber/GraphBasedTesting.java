package DudeneyNumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GraphBasedTesting {

    @Test
    public void testNodeCoverage() {

        assertTrue(DudeneyNumber.isDudeney(512)); 
    }

    @Test
    public void testEdgeCoverage() {

        assertFalse(DudeneyNumber.isDudeney(64)); 
        assertFalse(DudeneyNumber.isDudeney(65)); 

    }

    @Test
    public void testEdgePairCoverage() {
        assertFalse(DudeneyNumber.isDudeney(2)); 
        assertTrue(DudeneyNumber.isDudeney(1)); 
        assertFalse(DudeneyNumber.isDudeney(371)); 
    }

    @Test
    public void testCompleteCoverage() {
        assertFalse(DudeneyNumber.isDudeney(371)); // Node 1 -> Node 8
    }
}
