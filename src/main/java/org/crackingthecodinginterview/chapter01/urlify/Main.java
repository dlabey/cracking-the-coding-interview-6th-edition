package org.crackingthecodinginterview.chapter01.urlify;

class Main {
    static char[] urlify(char[] str) {
        // start from the end and this assumes fixed length like the book, if not do array copy
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                // shift right 2 spaces starting at the position after the original space until the array length is reached
                for (int j = str.length - 2; j > i + 1; j = j - 2) {
                    str[j] = str[j - 2];
                    str[j + 1] = str[j - 1];
                }
                // replace the space and the 2 chars after with %20
                str[i] = '%';
                str[i + 1] = '2';
                str[i + 2] = '0';
            }
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println("urlify:");
        char[] str = "Mr John Smith    ".toCharArray();
        System.out.println(new String(str));
        char[] str2 = urlify(str);
        System.out.println(new String(str2));
    }
}
