package org.crackingthecodinginterview.chapter01.palindromePermutation;

class Main {

    private static boolean isPalindrome(String str, int s, int e) {
        if (s == e) {
            return true;
        } else if (str.charAt(s) != str.charAt(e)) {
            return false;
        } else if (s < e + 1) {
            return isPalindrome(str, s + 1, e - 1);
        }

        return true;
    }

    private static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    private static String swap(String str, int i, int j) {
        char temp;
        char[] strArray = str.toCharArray();

        temp = strArray[i];
        strArray[i] = strArray[j];
        strArray[j] = temp;

        return String.valueOf(strArray);
    }

    private static boolean isPalindromePermutation(String str, int l, int r) {
        boolean isPalindrome = false;

        for (int i = l; i <= r; i++) {
            if (l == r) {
                // System.out.println(str);
                System.out.println(str.substring(0, str.length() - 3) + " " + str.substring(str.length() - 3));

                isPalindrome = isPalindrome(str);

                if (isPalindrome) {
                    break;
                }
            } else {
                str = swap(str, l, i);
                isPalindromePermutation(str, l + 1, r);
                str = swap(str, l, i);
            }
        }

        return isPalindrome;
    }

    static boolean isPalindromePermutation(String str) {
        // strip any spaces and convert to lowercase
        str = str.replace(" ", "").toLowerCase();

        // check if the palindrome is a permutation

        return isPalindromePermutation(str, 0, str.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println("isPalindromePermutation:");
        System.out.println(String.format("%1$s: %2$b", "Tact Coa", Main.isPalindromePermutation("Tact Coa")));
    }
}
