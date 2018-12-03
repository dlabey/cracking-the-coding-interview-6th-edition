package org.crackingthecodinginterview.chapter01.checkPermutation;

import java.util.Arrays;

public class Main {

    static boolean isPermutationSortedString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        str1 = String.join("", new String(str1Array));
        str2 = String.join("", new String(str2Array));

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
