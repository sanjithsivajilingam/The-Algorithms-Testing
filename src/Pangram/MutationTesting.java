package Pangram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MutationTesting {
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
      
    // Characteristic: Case Sensitivity for s
	
    @Test
    public void testUppercaseInput() {
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        boolean result = Pangram.isPangram2(input);
        System.out.println("Is input '" + input + "' a pangram? " + result);
        assertTrue("The input should be detected as a pangram: ", result);
    }
    
    // Characteristic: Number of Characters
    @Test
    public void testLessThan26Characters() {
        String input = "The quick brown fox jumps";
        boolean result = Pangram.isPangram2(input);
        System.out.println("Is input '" + input + "' a pangram? " + result);
        assertFalse("The input should not be detected as a pangram: ", result);
    }

    @Test
    public void testEmptyInput() {
        String input = "";
        boolean result = Pangram.isPangram2(input);
        System.out.println("Is input '" + input + "' a pangram? " + result);
        assertFalse("Null input should not be detected as a pangram: ", result);
    }
    
    // Characteristic: Non-alphabetic Characters (s)

    @Test
    public void testNumbersInput() {
        String input = "The quick brown fox jumps 0ver the lazy d0ggg";
        boolean result = Pangram.isPangram2(input);
        assertTrue("The input should NOT be detected as a pangram: ", result);
    }

    @Test
    public void testPunctuationMarksInput() {
        String input = "!The quick brown fox jumps, over the lazy dog.!";
        boolean result = Pangram.isPangram2(input);
        assertTrue("The input should NOT be detected as a pangram: ", result);
    }
}
