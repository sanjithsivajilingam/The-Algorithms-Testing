package Lower;

import static org.junit.Assert.*;
import org.junit.Test;

public class Mutation {

    // Test case for Node Coverage and Edge Coverage
    @Test
    public void testNodeCoverage() {
        // Add an assertion to check the output of toLowerCase method
        assertEquals("hello", Lower.toLowerCase("Hello"));

        // Ensure that the method behaves correctly for a different input
        assertEquals("world", Lower.toLowerCase("World")); // Added assertion for mutation survival detection
    }

    // Test case for Edge Pair Coverage
    @Test
    public void testEdgePairCoverage() {
        assertNotNull(Lower.toLowerCase("Hello")); // Original test
        assertNotNull(Lower.toLowerCase(""));     // Additional test for mutation at line 17
    }

    // Test case for Complete Coverage
    @Test
    public void testCompleteCoverage() {
        assertNotNull(Lower.toLowerCase(""));    // Original test
        assertNotNull(Lower.toLowerCase("Hello"));// Additional test for mutation at line 10
    }
}
