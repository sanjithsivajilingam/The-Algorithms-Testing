package Alphabetical;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GraphBasedTesting {
	
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
    
    // Test case for Path3 {[1, 2, 3, 6]}
    // Not possible because the loop always runs at least once since 'i' is initialized to 0,
    // and it will always be less than s.length() - 1 initially.
	
    // Test case for path {[1, 2, 3, 4, 5, 3, 4, 5]}
    @Test
    public void testAlphabeticalOrderPath4(){
    	String s = "abczdef";
        boolean result = Alphabetical.isAlphabetical(s);
        System.out.println("Is '" + s + "' alphabetical? " + result);
        assertFalse("The input '" + s + "' should not be in alphabetical order", result);
    }
}
