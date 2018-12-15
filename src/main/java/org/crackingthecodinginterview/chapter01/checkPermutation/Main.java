package org.crackingthecodinginterview.chapter01.checkPermutation;

import java.util.Arrays;

class Main {

    static boolean isPermutationSortedString(String str1, String str2) {
        // make sure the length of the string is the same length, otherwise its not a permutation
        if (str1.length() != str2.length()) {
            return false;
        }

        // convert both strings to character arrays
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        // sort the character arrays and then convert them to a string
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        str1 = String.join("", new String(str1Array));
        str2 = String.join("", new String(str2Array));

        // determine if they are permutations by seeing if they are equal now
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        System.out.println("isPermutationSortedString:");
        String str1 = "test1";
        String str2 = "test2";
        System.out.println(String.format("%1$s and %2$s: %3$b", str1, str2, isPermutationSortedString(str1, str2)));
        str1 = "dog";
        str2 = "god";
        System.out.println(String.format("%1$s and %2$s: %3$b", str1, str2, isPermutationSortedString(str1, str2)));
    }
}
