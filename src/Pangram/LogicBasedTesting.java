package Pangram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LogicBasedTesting {
    // Predicate P1: (s.length() < 26)
    @Test
    public void testPredicateP1InputGreaterThan26() {
        String input ="abcdefghijklmnopqrstuvwxyz";
        boolean result = Pangram.isPangram2(input);
        System.out.println("Is '" + input + "' a pangram? " + result);
        assertTrue("The input should be a pangram", result);
    }

    @Test
    public void testPredicateP1InputLessThan26() {
        String input = "the sky is blue";
        boolean result = Pangram.isPangram2(input);
        System.out.println("Is '" + input + "' a pangram? " + result);
        assertFalse("The input string length should not be a pangram", result);
    }

    // Predicate P2: (s.indexOf(i) == -1)
    // Check if a specific character from the alphabet is in the input string ‘s’

    @Test
    public void testPredicateP2AllAlphabetsPresent() {
        String input = "the quick brown fox jumps over the lazy dog";
        boolean result = Pangram.isPangram2(input);
        System.out.println("Is '" + input + "' a pangram? " + result);
        assertTrue("The input string length should be a pangram", result);
    }
    
    @Test
    public void testPredicateP2NotAllAlphabetsPresent() {
        String input = "abcdefghijklmnopqrstuvwxyy";
        boolean result = Pangram.isPangram2(input);
        System.out.println("Is '" + input + "' a pangram? " + result);
        assertFalse("The input string length should not be a pangram", result);
    }

}
