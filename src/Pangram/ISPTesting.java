package Pangram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

// Code doesn't handle null inputs
// Code doesn't remove non-alphabetic characters

public class ISPTesting {
	
    // Characteristic: Case Sensitivity for s
	
    @Test
    public void testUppercaseInput() {
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        boolean result = Pangram.isPangram2(input);
        System.out.println("Is input '" + input + "' a pangram? " + result);
        assertTrue("The input should be detected as a pangram: ", result);
    }

    @Test
    public void testLowercaseInput() {
        String input = "the quick brown fox jumps over the lazy dog";
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
    public void testAtLeast26Characters() {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = Pangram.isPangram2(input);
        System.out.println("Is input '" + input + "' a pangram? " + result);
        assertTrue("The input should be detected as a pangram: ", result);
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
