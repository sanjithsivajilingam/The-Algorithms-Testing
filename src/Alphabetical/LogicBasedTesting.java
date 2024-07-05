package Alphabetical;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LogicBasedTesting {
    // Given Predicate: !Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))
    
    // Clause: !Character.isLetter(s.charAt(i))
    // Check if character at index 'i' is a letter
    @Test
    public void testIsLetter_NonLetterCharacter() {
        String input = "abc123";
        boolean result1 = Alphabetical.isAlphabetical(input);
        System.out.println("Is '" + input + "' in alphabetical order? " + result1);
        assertFalse(result1);
    }

    @Test
    public void testIsLetter_AllLetters() {
        String input = "abcdef";
        boolean result2 = Alphabetical.isAlphabetical(input);
        System.out.println("Is '" + input + "' in alphabetical order? " + result2);
        assertTrue(result2);
    }

    // Clause: !(s.charAt(i) <= s.charAt(i + 1))
    // Check if characters are in ascending order
    @Test
    public void testAlphabeticalOrder_DescendingOrder() {
        String input = "cba";
        boolean result3 = Alphabetical.isAlphabetical(input);
        System.out.println("Is '" + input + "' in alphabetical order? " + result3);
        assertFalse(result3);
    }

    @Test
    public void testAlphabeticalOrder_AscendingOrder() {
        String input = "abc";
        boolean result4 = Alphabetical.isAlphabetical(input);
        System.out.println("Is '" + input + "' in alphabetical order? " + result4);
        assertTrue(result4);
    }
}
