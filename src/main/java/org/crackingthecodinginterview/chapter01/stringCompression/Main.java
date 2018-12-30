package org.crackingthecodinginterview.chapter01.stringCompression;

class Main {

    // aabcccccaaa => a2b1c5a3; if not smaller, then same string
    static String compressString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char prevChar = str.charAt(0);
        int charCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char strChar = str.charAt(i);

            if (prevChar == strChar) {
                charCount++;

                if (i + 1 == str.length()) {
                    stringBuilder.append(prevChar);
                    stringBuilder.append(charCount);
                }
            } else {
                stringBuilder.append(prevChar);
                stringBuilder.append(charCount);

                prevChar = str.charAt(i);
                charCount = 1;
            }
        }

        if (stringBuilder.toString().length() < str.length()) {
            str = stringBuilder.toString();
        }

        return str;
    }

    // aabcccccaaa => a2b1c5a3; if not smaller, then same string
    public static void main(String[] args) {
        System.out.println("compressString:");
        System.out.println(String.format("%1$s: %2$s", "aabcccccaaa", compressString("aabcccccaaa")));
        System.out.println(String.format("%1$s: %2$s", "abbc", compressString("abbc")));
    }
}
