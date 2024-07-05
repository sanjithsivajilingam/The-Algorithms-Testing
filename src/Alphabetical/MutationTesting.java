package Alphabetical;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MutationTesting {

    // Test case for Path1 {[1, 2, 3, 4, 5]}
    @Test
    public void testAlphabeticalOrderPath1() {
        String s = "123abc";
        boolean result = Alphabetical.isAlphabetical(s);
        System.out.println("Is '" + s + "' alphabetical? " + result);
        assertFalse("The input '" + s + "' should not be in alphabetical order", result);
    }
    
    // Test case for Path2 {[1, 2, 3, 4, 5, 3, 6]}
    @Test
    public void testAlphabeticalOrderPath2() {
    	String s = "aBcDef";
        boolean result = Alphabetical.isAlphabetical(s);
        System.out.println("Is '" + s + "' alphabetical? " + result);
        assertTrue("The input '" + s + "' should in alphabetical order", result);
    }

    // Test case for path {[1, 2, 3, 4, 5, 3, 4, 5]}
    @Test
    public void testAlphabeticalOrderPath4(){
    	String s = "abczdef";
        boolean result = Alphabetical.isAlphabetical(s);
        System.out.println("Is '" + s + "' alphabetical? " + result);
        assertFalse("The input '" + s + "' should not be in alphabetical order", result);
    }
    
    // Upper Case in Alphabetical Order
 	@Test
 	public void testUpperCaseAlphabeticalOrder() {
 	    String input = "AbCdEfGhIjK";
 	    boolean result = Alphabetical.isAlphabetical(input);
 	    System.out.println("Is '" + input + "' alphabetical? " + result);
 	    assertTrue("The input '" + input + "' should be alphabetical: ", result);
 	}
 	
 	// Lower Case in Non-Alphabetical Order
 	@Test
 	public void testLowerCaseNonAlphabeticalOrder() {
 	    String input = "mapvceplnszuipa";
 	    boolean result = Alphabetical.isAlphabetical(input);
 	    System.out.println("Is '" + input + "' alphabetical? " + result);
 	    assertFalse("The input '" + input + "' should not be alphabetical: ", result);
 	}
 	
 	// Symbols and Numbers:
 	@Test
 	public void testSymbols() {
 	    String input = "&c-!1$2%3";
 	    boolean result = Alphabetical.isAlphabetical(input);
 	    System.out.println("Is '" + input + "' alphabetical? " + result);
 	    assertFalse("The input '" + input + "' should not be alphabetical, as symbols are invalid: ", result);
 	}
 	
 	// ** Number of Characters:
 	
 	// Empty input:
 	@Test
 	public void testEmptyInput() {
         String input = "";
         boolean result = Alphabetical.isAlphabetical(input);
         System.out.println("Is '" + input + "' alphabetical? " + result);
         assertTrue("The input '" + input + "' should be alphabetical: ", result);
 	}
 	
 	// Repeating letters
 	@Test
 	public void repeatingLettersAlphabetical() {
 	    String input = "aaabbbbccc";
 	    boolean result = Alphabetical.isAlphabetical(input);
 	    System.out.println("Is '" + input + "' alphabetical? " + result);
 	    assertTrue("The input '" + input + "' should be alphabetical: ", result);
 	}
}
