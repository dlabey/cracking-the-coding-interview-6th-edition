package org.crackingthecodinginterview.chapter01.palindromePermutation;

import java.util.HashMap;
import java.util.Map;

class Main {

    static boolean isPalindromePermutation(String str) {
        // make a hash map to store the count of character occurrences
        HashMap<Character, Integer> charCounts = new HashMap<>();

        // go through the string and skip spaces, but keep track of how many occurrences of a char occur
        for (int i = 0; i < str.length(); i++) {
            Character character = str.toLowerCase().charAt(i);

            if (character == ' ') {
                continue;
            }

            Object charCount = charCounts.get(character);

            if (charCount == null) {
                charCounts.put(character, 1);
            } else {
                charCount = (int)charCount + 1;
                charCounts.put(character, (int)charCount);
            }
        }

        // go through the hash map and check if there is more than 1 odd occurrence (means not a palindrome)
        Integer oddCharCount = 0;
        for (Integer charCount : charCounts.values()) {
            if (charCount % 2 != 0 && ++oddCharCount > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("isPalindromePermutation:");
        System.out.println(String.format("%1$s: %2$b", "Tact Coa", isPalindromePermutation("Tact Coa")));
    }
}
