package org.crackingthecodinginterview.chapter01.oneAway;

public class Main {

    static boolean isOneAway(String original, String changed) {
        if (Math.abs(original.length() - changed.length()) > 1) {
            return false;
        }

        if (original.length() == changed.length()) {
            int diffs = 0;

            for (int i = 0; i < original.length(); i++) {
                if (original.charAt(i) != changed.charAt(i)) {
                    if (++diffs > 1) {
                        return false;
                    }
                }
            }
        } else {
            String longer;
            String shorter;
            int longerLength;
            int shorterLength;

            if (original.length() > changed.length()) {
                longer = original;
                shorter = changed;
                longerLength = original.length();
                shorterLength = changed.length();
            } else {
                longer = changed;
                shorter = original;
                longerLength = changed.length();
                shorterLength = original.length();
            }

            int diffs = 0;

            for (int i = 0, j = 0; i < longerLength && j < shorterLength; i++, j++) {
                char char1 = longer.charAt(i);
                char char2 = shorter.charAt(j);

                if (char1 != char2) {
                    if (++diffs > 1) {
                        return false;
                    }
                    i++;
                }
            }
        }

        return true;
    }

    // insert a char
    // remove a char
    // replace a char
    // pale => ple = true, pales => pale = true, pale => bale = true, pale => bake = false
    // hint: each condition separately?, what is the relationship between insert and remove? do they need to be checked
    // separately? can you do all 3 checks in a single pass?
    public static void main(String[] args) {
        System.out.println("isPalindromePermutation:");
        System.out.println(String.format("%1$s: %2$b", "pale, ple", isOneAway("pale", "ple")));
        System.out.println(String.format("%1$s: %2$b", "pales, pale", isOneAway("pales", "pale")));
        System.out.println(String.format("%1$s: %2$b", "pale, bale", isOneAway("pale", "bale")));
        System.out.println(String.format("%1$s: %2$b", "pale, bake", isOneAway("pale", "bake")));
    }
}
