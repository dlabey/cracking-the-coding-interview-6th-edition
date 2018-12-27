package org.crackingthecodinginterview.chapter01.stringCompression;

public class Main {

    // aabcccccaaa => a2b1c5a3; if not smaller, then same string
    static String compressString(String str) {
        return str;
    }

    // aabcccccaaa => a2b1c5a3; if not smaller, then same string
    public static void Main(String[] args) {
        System.out.println("compressString:");
        System.out.println(String.format("%1$s: %2$b", "aabcccccaaa", compressString("aabcccccaaa")));
    }
}
