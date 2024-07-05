package DudeneyNumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MutationTesting {

    @Test
    public void testNodeCoverage() {

        assertTrue(DudeneyNumber.isDudeney(512)); // Node 1 -> Node 8
    }

    @Test
    public void testEdgeCoverage() {

        assertFalse(DudeneyNumber.isDudeney(64)); // Edge [1, 6]
        assertFalse(DudeneyNumber.isDudeney(65)); // Edge [1, 6]

    }

    @Test
    public void testEdgePairCoverage() {
        assertFalse(DudeneyNumber.isDudeney(2)); // Edge pair {[1, 2]}
        assertTrue(DudeneyNumber.isDudeney(1)); // Edge pair {[1, 4]}
        assertFalse(DudeneyNumber.isDudeney(28)); // Edge pair {[1, 5]}
        assertFalse(DudeneyNumber.isDudeney(64)); // Edge pair {[1, 6]}
        assertFalse(DudeneyNumber.isDudeney(371)); // Edge pair {[1, 8]}
    }

    @Test
    public void testCompleteCoverage() {
        assertFalse(DudeneyNumber.isDudeney(2)); // Node 1 -> Node 2
        assertTrue(DudeneyNumber.isDudeney(1)); // Node 1 -> Node 4
        assertFalse(DudeneyNumber.isDudeney(28)); // Node 1 -> Node 5
        assertFalse(DudeneyNumber.isDudeney(64)); // Node 1 -> Node 6
        assertFalse(DudeneyNumber.isDudeney(371)); // Node 1 -> Node 8
    }
}
