package org.crackingthecodinginterview.chapter01.urlify;

public class Main {

    static char[] urlify(char[] str) {
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                for (int j = str.length - 1; j > i; j--) {
                    for (int k = 0; k <= 2; k++) {
                        int l = j - k;
                        int before = l - 1;

                        str[l] = str[before];
                    }
                }
                str[i] = '%';
                str[i + 1] = '2';
                str[i + 2] = '0';

                return urlify(str);
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
