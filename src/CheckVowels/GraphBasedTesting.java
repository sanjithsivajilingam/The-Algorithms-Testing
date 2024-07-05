package CheckVowels;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GraphBasedTesting {
	
    // Test case for Path1 {[1, 2, 3]}
    @Test
    public void testVowelsPresencePath1() {
        String input = null;
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertFalse("The input '" + input + "' should not contain vowels", result);
    }
    
    // Test case for Path2 {[1, 2, 4, 5, 6, 7]}
    @Test
    public void testVowelsPresencePath2() {
        String input = "apple";
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertTrue("The input '" + input + "' should contain vowels", result);
    }
    
    // Test case for Path3 {[1, 2, 4, 5, 6, 5, 8]}
    @Test
    public void testVowelsPresencePath3() {
        String input = "brk";
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertFalse("The input '" + input + "' should not contain vowels", result);
    }
    
    // Test case for Path4 {[1, 2, 4, 5, 6, 5, 6, 7]}
    @Test
    public void testVowelsPresencePath4() {
        String input = "break";
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertTrue("The input '" + input + "' should contain vowels", result);
    }
    
    // Test case for Path5 {[1, 2, 4, 5, 8]}
    // Not possible since the loop variable 'i' is initialized to 0 at Node 4, so 
    // it will always be less than the length of the input string initially
    // assuming that the input string is not null. So, the program will always 
    // enter Node 6 to check the characters of the input string.
}
