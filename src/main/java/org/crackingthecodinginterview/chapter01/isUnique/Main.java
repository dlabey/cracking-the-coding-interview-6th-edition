package org.crackingthecodinginterview.chapter01.isUnique;

import java.util.ArrayList;
import java.util.List;

class Main {
    static boolean isUniqueListDataStructure(String str) {
        List<Character> chars = new ArrayList<>();

        // determine if the string is fully unique by making sure there are no repeatable characters in the array
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if (chars.contains(character)) {
                return false;
            } else {
                chars.add(character);
            }
        }

        return true;
    }

    private static boolean isUniqueNoDataStructure(String str) {
        int checker = 0;

        // determine if the string is fully unique by making sure there are no repeatable characters through a bitshift checker
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i) - 'a';

            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }

        return true;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"teeth", "sharks", "coding", "dad"};

        System.out.println("isUniqueListDataStructure:");
        for (String string : strings) {
            System.out.println(String.format("%1$s: %2$b", string, isUniqueListDataStructure(string)));
        }

        System.out.println();

        System.out.println("isUniqueNoDataStructure:");
        for (String string : strings) {
            System.out.println(String.format("%1$s: %2$b", string, isUniqueNoDataStructure(string)));
        }
    }
}
