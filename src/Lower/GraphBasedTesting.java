package Lower;
import static org.junit.Assert.*;
import org.junit.Test;

public class GraphBasedTesting {

    // Test case for Node Coverage and Edge Coverage
    @Test
    public void testNodeCoverage() {
    	assertEquals("hello", Lower.toLowerCase("Hello"));    	
    }

    // Test case for Edge Pair Coverage
    @Test
    public void testEdgePairCoverage() {
        assertNotNull(Lower.toLowerCase("Hello"));  // Edge Pairs 1 -> 2 and 2 -> 3, 3 -> 4 and 4->2 
        assertNotNull(Lower.toLowerCase(""));      // Edges Pairs 3 -> 4 and 4->5
    }
    
    // Test case for Complete Coverage
    @Test
    public void testCompleteCoverage() {
        assertNotNull(Lower.toLowerCase("Hello"));  // All possbible cases 
    }
}