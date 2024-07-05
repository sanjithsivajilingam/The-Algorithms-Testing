package IsPowerTwo;
import static org.junit.Assert.*;
import org.junit.Test;

public class MutationTesting {

    // Test case for Node Coverage
    @Test
    public void testNodeCoverage() {
        assertTrue(IsPowerTwo.isPowerTwo(2));  // Node 1,2,3,4 
    }

    // Test case for Edge Coverage
    @Test
    public void testEdgeCoverage() {
        assertTrue(IsPowerTwo.isPowerTwo(2));  // Node 1 -> Node 2 -> Node 3 -> Node 4 
    }

    // Test case for Edge Pair Coverage
    public void testEdgePairCoverage() {
        assertTrue(IsPowerTwo.isPowerTwo(-2));  // Node 1 -> Node 2 
        assertFalse(IsPowerTwo.isPowerTwo(3)); // Node 1 -> Node 3 and Node 3 -> Node 4
    }


    // Test case for Complete Path Coverage
    @Test
    public void testCompletePathCoverage() {
        assertTrue(IsPowerTwo.isPowerTwo(1));  // Node A -> Node B -> Node C
    }
}


//Node coverage ensures each node is tested
//Edge coverage ensures each transition is tested 
//Edge Pair coverage ensures each pair of transitions is tested
//CompletePath coverage ensures all possible paths are tested 