package org.crackingthecodinginterview.chapter01.palindromePermutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void isPalindromePermutationShouldReturnTrue() {
        boolean isPalindromePermutation = Main.isPalindromePermutation("Tact Coa");

        Assertions.assertTrue(isPalindromePermutation);
    }

    @Test
    void isPalindromePermutationShouldReturnFalse() {
        boolean isPalindromePermutation = Main.isPalindromePermutation("big ruth");

        Assertions.assertFalse(isPalindromePermutation);
    }
}
