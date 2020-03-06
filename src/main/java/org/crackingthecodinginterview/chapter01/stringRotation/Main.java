package org.crackingthecodinginterview.chapter01.stringRotation;

public class Main {

    static boolean isSubstring(String s1, String s2) {
        String strStr = s1 + s1;

        return strStr.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isSubstring("waterbottle", "erbottlewat"));
    }
}
