package CheckVowels;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ISPTesting {

	// ** Characteristic: Case Sensitivity:
	
    @Test
    public void testVowelsUppercase() {
        String input = "HELLO";
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertTrue("The input '" + input + "' should contain vowels: ", result);
    }

	@Test
	public void testNoVowelsUppercase() {
	    String input = "WRLD";
	    boolean result = CheckVowels.hasVowels(input);
	    System.out.println("Does '" + input + "' contain vowels? " + result);
	    assertFalse("The input '" + input + "' should not contain vowels: ", result);
	}
	
    @Test
    public void testVowelsLowercase() {
        String input = "hello";
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
	
	// ** Characteristic: Non-alphabetic Characters:
	
    @Test
    public void testNumbersWithVowels() {
        String input = "12a3b4u5E6I7o890";
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertTrue("The input '" + input + "' should contain vowels: ", result);
    }
    
    @Test
    public void testSymbolsWithVowels() {
        String input = "1-$!3%Eo%";
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertTrue("The input '" + input + "' should contain vowels: ", result);
    }
    
    // ** Testing Null Input:

    @Test
    public void testNullInput() {
        String input = null;
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does a null input contain vowels? " + result);
        assertFalse("The input should be null: ", result);
    }
}
