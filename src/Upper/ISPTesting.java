package Upper;

import static org.junit.Assert.*;
import org.junit.Test;

public class ISPTesting {

    // Test for lowercase characters
    @Test
    public void testLowerCaseCharacters() {
        assertEquals("HELLO", Upper.toUpperCase("hello"));
    }

    // Test for uppercase characters
    @Test
    public void testUpperCaseCharacters() {
        assertEquals("HELLO", Upper.toUpperCase("HELLO"));
    }

    // Test for digits
    @Test
    public void testDigits() {
        assertEquals("12345", Upper.toUpperCase("12345"));
    }

    // Test for special characters
    @Test
    public void testSpecialCharacters() {
        assertEquals("!@#$%", Upper.toUpperCase("!@#$%"));
    }

    // Test for null input
    @Test
    public void testNullInput() {
        assertNull(Upper.toUpperCase(null));
    }

}
