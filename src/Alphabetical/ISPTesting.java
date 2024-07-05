package Alphabetical;

import static org.junit.Assert.*;

import org.junit.Test;

public class ISPTesting {

	// ** Characteristic: Case Sensitivity: 
	
	// Upper Case in Alphabetical Order
	@Test
	public void testUpperCaseAlphabeticalOrder() {
	    String input = "AbCdEfGhIjK";
	    boolean result = Alphabetical.isAlphabetical(input);
	    System.out.println("Is '" + input + "' alphabetical? " + result);
	    assertTrue("The input '" + input + "' should be alphabetical: ", result);
	}
	
	// Upper Case in Non-Alphabetical Order
	@Test
	public void testUpperCaseNonAlphabeticalOrder() {
	    String input = "AbCZxPKdsR";
	    boolean result = Alphabetical.isAlphabetical(input);
	    System.out.println("Is '" + input + "' alphabetical? " + result);
	    assertFalse("The input '" + input + "' should not be alphabetical: ", result);
	}
	
	// Lower Case in Alphabetical Order
	@Test
	public void testLowerCaseAlphabeticalOrder() {
	    String input = "acefhklmp";
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
	
	// ** Characteristic: Non-alphabetical Characters:
	
	// Numbers:
	@Test
	public void testNumbers() {
	    String input = "abc123";
	    boolean result = Alphabetical.isAlphabetical(input);
	    System.out.println("Is '" + input + "' alphabetical? " + result);
	    assertFalse("The input '" + input + "' should not be alphabetical, as numbers are invalid: ", result);
	}
	
	// Symbols:
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
	
	// Single character input:
	@Test
	public void testSingleCharacter() {
	    String input = "x";
	    boolean result = Alphabetical.isAlphabetical(input);
	    System.out.println("Is '" + input + "' alphabetical? " + result);
	    assertTrue("The input '" + input + "' should be alphabetical: ", result);
	}
	
	// Multiple characters:
	public void testMultipleCharacters() {
	    String input = "lmnop";
	    boolean result = Alphabetical.isAlphabetical(input);
	    System.out.println("Is '" + input + "' alphabetical? " + result);
	    assertTrue("The input '" + input + "' should be alphabetical: ", result);
	}	
	
	// ** Additional Tests:
	
	// Repeating letters
	@Test
	public void repeatingLettersAlphabetical() {
	    String input = "aaabbbbccc";
	    boolean result = Alphabetical.isAlphabetical(input);
	    System.out.println("Is '" + input + "' alphabetical? " + result);
	    assertTrue("The input '" + input + "' should be alphabetical: ", result);
	}
}
