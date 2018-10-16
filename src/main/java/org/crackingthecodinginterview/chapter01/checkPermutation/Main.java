package main.java.org.crackingthecodinginterview.chapter01.checkPermutation;

import java.util.List;

public class Main {

    private static boolean isPermutationSortedString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        str1 = str1.chars().sorted().toString();
        str2 = str2.chars().sorted().toString();

        return str1.equals(str2);
    }

    public static void main(String[] args) {
        System.out.println("isPermutation:");
        String str1 = "test1";
        String str2 = "test2";
        System.out.println(String.format("%1$s and %2$s: %3$b", str1, str2, isPermutationSortedString("test1", "test2")));
    }
}
