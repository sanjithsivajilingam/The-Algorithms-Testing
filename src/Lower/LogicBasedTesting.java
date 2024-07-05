package Lower;
import static org.junit.Assert.*;
import org.junit.Test;

public class LogicBasedTesting {

    // Test case for Predicate Coverage: s = "Hello", P1 = True
    @Test
    public void testPredicateCoverageTrue() {
        assertEquals("hello", Lower.toLowerCase("Hello"));
    }

    // Test case for Predicate Coverage: s = "1234", P1 = False
    @Test
    public void testPredicateCoverageFalse() {
        assertEquals("1234", Lower.toLowerCase("1234"));
    }

    // Test cases for Clause Coverage
    @Test
    public void testClauseCoverage1() {
        // s = "HELLO", C1 = true, C2 = true
        assertEquals("hello", Lower.toLowerCase("HELLO"));
    }

    @Test
    public void testClauseCoverage2() {
        // s = "hello", C1 = true, C2 = false
        assertEquals("hello", Lower.toLowerCase("hello"));
    }

    @Test
    public void testClauseCoverage3() {
        // s = "Hello1234", C1 = false, C2 = true
        assertEquals("hello1234", Lower.toLowerCase("Hello1234"));
    }

    @Test
    public void testClauseCoverage4() {
        // s = "1234", C1 = false, C2 = false
        assertEquals("1234", Lower.toLowerCase("1234"));
    }
}
