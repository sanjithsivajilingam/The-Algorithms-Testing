package Pangram;

import java.util.HashSet;

/**
 * Wikipedia: https://en.wikipedia.org/wiki/Pangram
 */
public class Pangram {
    /**
     * Checks if a String is Pangram or not by checking if each alhpabet is present or not
     *
     * @param s The String to check
     * @return {@code true} if s is a Pangram, otherwise {@code false}
     */
    public static boolean isPangram2(String s) {
        if (s.length() < 26) {
            return false;
        }
        s = s.toLowerCase(); // Converting s to Lower-Case
        for (char i = 'a'; i <= 'z'; i++) {
            if (s.indexOf(i) == -1) {
                return false; // if any alphabet is not present, return false
            }
        }
        return true;
    }
}