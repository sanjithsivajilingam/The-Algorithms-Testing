package Pangram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GraphBasedTesting {

    // Test case for Path1 {[1, 2, 3]}
    @Test
    public void testPangramPath1() {
        String input = "hello world";
        boolean result = Pangram.isPangram2(input);
        System.out.println("Is '" + input + "' a pangram? " + result);
        assertFalse("The input '" + input + "' is not a pangram", result);
    }
    
    // Test case for Path1 {[1, 2, 4, 5, 6, 7]}
    @Test
    public void testPangramPath2() {
        String input = "the quick brown fox umps over the lazy dog";
        boolean result = Pangram.isPangram2(input);
        System.out.println("Is '" + input + "' a pangram? " + result);
        assertFalse("The input '" + input + "' is not a pangram", result);
    }
    
    // Test case for Path3 {[1, 2, 4, 5, 6, 5, 8]}
    @Test
    public void testPangramPath3() {
        String input = "the quick brown fox jumps over the lazy dog";
        boolean result = Pangram.isPangram2(input);
        System.out.println("Is '" + input + "' a pangram? " + result);
        assertTrue("The input '" + input + "' is a pangram", result);
    }
    
    // Test case for Path4 {[1, 2, 4, 5, 8]}
    // Not possible since the loop variable 'i' is initialized to 'a' at Node 4, so 
    // it will always be less than 'z' initially assuming that the input string is not null
    // So, the program will always enter Node 6 to check the characters of the input string.
}
