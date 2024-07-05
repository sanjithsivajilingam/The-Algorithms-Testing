package CheckVowels;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LogicBasedTesting {
	
    // Predicate P1: (input == null)

    @Test
    public void testPredicateP1_NullInput() {
        String input = null;
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertFalse("The input should be null: ", result);
    }

    @Test
    public void testPredicateP1_NonNullInput() {
        String input = "abc";
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertTrue("The input should not be null: ", result);
    }
    
    // Predicate P2: (VOWELS.contains(input.charAt(i)))
    @Test
    public void testPredicateP2_ContainsVowels() {
        String input = "hEllo";
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertTrue("The input should contain vowels: ", result);
    }

    @Test
    public void testPredicateP2_NoVowels() {
        String input = "fly";
        boolean result = CheckVowels.hasVowels(input);
        System.out.println("Does '" + input + "' contain vowels? " + result);
        assertFalse("The input should not contain vowels: ", result);
    }
}




