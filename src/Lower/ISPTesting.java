package Lower;
import static org.junit.Assert.*;
import org.junit.Test;

public class ISPTesting {

    // Test for lowercase characters
    @Test
    public void testLowerCaseCharacters() {
        assertEquals("hello", Lower.toLowerCase("hello"));
        assertEquals("world", Lower.toLowerCase("world"));
    }

    // Test for uppercase characters
    @Test
    public void testUpperCaseCharacters() {
        assertEquals("hello", Lower.toLowerCase("HELLO"));
        assertEquals("world", Lower.toLowerCase("WORLD"));
    }

    // Test for digits
    @Test
    public void testDigits() {
        assertEquals("12345", Lower.toLowerCase("12345"));
    }

    // Test for special characters
    @Test
    public void testSpecialCharacters() {
        assertEquals("@#$%", Lower.toLowerCase("@#$%"));
        assertEquals("!@&*", Lower.toLowerCase("!@&*"));
    }

    // Test for null input
    @Test(expected = NullPointerException.class)
    public void testNullInput() {
        Lower.toLowerCase(null);
    }

    // Test for not-null input
    @Test
    public void testNotNullInput() {
        assertNotNull(Lower.toLowerCase("Test"));
        assertNotNull(Lower.toLowerCase(""));
    }
}
