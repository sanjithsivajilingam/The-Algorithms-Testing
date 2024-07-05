package Upper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import Upper.Upper;

public class GraphBasedTesting {

    @Test
    public void testNodeCoverage() {
        assertEquals("HELLO", Upper.toUpperCase("hello"));
    }

    @Test
    public void testEdgeCoverage() {
        assertEquals("", Upper.toUpperCase(""));
        assertEquals("HELLO", Upper.toUpperCase("hello"));
    }

    @Test
    public void testEdgePairCoverage() {
        assertEquals("", Upper.toUpperCase(""));
        assertEquals("HELLO", Upper.toUpperCase("hello"));
        assertEquals("12345", Upper.toUpperCase("12345"));
    }

    @Test
    public void testCompleteCoverage() {
        assertNull(Upper.toUpperCase(null));
        assertEquals("", Upper.toUpperCase(""));
    }
}
