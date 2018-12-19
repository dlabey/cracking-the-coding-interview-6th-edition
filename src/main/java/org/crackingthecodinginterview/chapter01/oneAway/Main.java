package org.crackingthecodinginterview.chapter01.oneAway;

public class Main {

    static boolean isOneAway(String original, String changed) {
        if (original.equals(changed)) {
            return false;
        }

        int changes = 0;
        int length = original.length() > changed.length() ? changed.length() : original.length();

        for (int i = 0; i < length; i++) {
            if (original.charAt(i) != changed.charAt(i)) {
                changes++;
                break;
            }
        }

        if (original.length() > changed.length()) {
            changes++;
        } else if (original.length() < changed.length()) {
            changes++;
        }

        return (changes > 0) && (changes - 2 == 0);
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
        System.out.println(String.format("%1$s: %2$b", "pales, ple", isOneAway("pales", "ple")));
        System.out.println(String.format("%1$s: %2$b", "pale, bale", isOneAway("pale", "bale")));
        System.out.println(String.format("%1$s: %2$b", "pale, bake", isOneAway("pale", "bake")));
    }
}
