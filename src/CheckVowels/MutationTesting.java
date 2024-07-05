package CheckVowels;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MutationTesting {
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
    
	// ** Characteristic: Case Sensitivity:
	
    @Test
    public void testVowelsUppercase() {
        String input = "HELLO";
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertTrue("The input '" + input + "' should contain vowels: ", result);
    }
    
	@Test
	public void testNoVowelsLowercase() {
	    String input = "fly";
	    boolean result = CheckVowels.hasVowels(input);
	    System.out.println("Does '" + input + "' contain vowels? " + result);
	    assertFalse("The input '" + input + "' should not contain vowels: ", result);
	}
	    
    @Test
    public void testSymbolsWithVowels() {
        String input = "1-$!3%Eo%";
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertTrue("The input '" + input + "' should contain vowels: ", result);
    }
    
    @Test
    public void testNullInput() {
        String input = null;
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does input contain vowels? " + result);
        assertFalse("The input should be null: ", result);
    }
    
    @Test
    public void testPredicateP2_NoVowels() {
        String input = "fly";
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does the input contain vowels? " + result);
        assertFalse("The input should not contain vowels: ", result);
    }
}
