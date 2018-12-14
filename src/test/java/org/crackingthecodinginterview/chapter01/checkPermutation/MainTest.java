package org.crackingthecodinginterview.chapter01.checkPermutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void isPermutationSortedStringShouldReturnFalse() {
        boolean isPermutationSortedString = Main.isPermutationSortedString("test1", "test2");

        Assertions.assertFalse(isPermutationSortedString);
    }

    @Test
    void isPermutationSortedStringShouldReturnTrue() {
        boolean isPermutationSortedString = Main.isPermutationSortedString("dog", "god");

        Assertions.assertTrue(isPermutationSortedString);
    }
}
