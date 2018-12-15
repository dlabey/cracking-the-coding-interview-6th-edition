package org.crackingthecodinginterview.chapter01.urlify;

class Main {
    static char[] urlifyFixed(char[] str) {
        // start from the end and this assumes fixed length like the book
        for (int i = 0; i < str.length; i++) {
            if (i + 1 > str.length - 1 || i + 2 > str.length - 1) {
                return str;
            } else {
                if (str[i] == ' ' && str[i + 1] == ' ' && str[i + 2] == ' ') {
                    // replace the space and the 2 chars after with %20
                    str[i] = '%';
                    str[i + 1] = '2';
                    str[i + 2] = '0';
                } else {
                    if (str[i] == ' ') {
                        char[] newStr = new char[str.length];
                        int iLeftLength = i + 1;
                        int iRight = i + 2;
                        int iRightLength = str.length - iRight;

                        System.arraycopy(str, 0, newStr, 0, iLeftLength);
                        System.arraycopy(str, iLeftLength, newStr, iRight, iRightLength);

                        newStr[i + 1] = ' ';

                        return urlifyFixed(newStr);
                    }
                }
            }
        }

        return str;
    }

    static char[] urlify(char[] str) {
        // start from the end and this is unfixed length
        for (int i = 0; i < str.length; i++) {
            // if there is a space, create a new array with 2 more items and copy the existing array around them
            if (str[i] == ' ') {
                char[] newStr = new char[str.length + 2];
                int iLeftLength = i + 1;
                int iRight = i + 2;
                int iRightLength = str.length - i;

                System.arraycopy(str, 0, newStr, 0, iLeftLength);
                System.arraycopy(str, i, newStr, iRight, iRightLength);

                newStr[i] = '%';
                newStr[i + 1] = '2';
                newStr[i + 2] = '0';

                str = newStr;
            }
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println("urlifyFixed:");
        char[] str = "Mr John Smith    ".toCharArray();
        System.out.println(new String(str));
        char[] str2 = urlifyFixed(str);
        System.out.println(new String(str2));
        System.out.println("urlify:");
        char[] str3 = urlify(str);
        System.out.println(new String(str3));
    }
}
