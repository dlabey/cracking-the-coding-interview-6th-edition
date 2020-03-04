package org.crackingthecodinginterview.chapter01.zeroMatrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void zeroShouldZeroMatrix() {
        int[][] matrix = new int[][] {
                { 1, 0, 3},
                { 4, 5, 2},
                { 0, 8, 9}
        };
        Main.zero(matrix);
        int[][] zeroedMatrix = new int[][] {
                { 0, 0, 0},
                { 0, 0, 2},
                { 0, 0, 0}
        };

        Assertions.assertEquals(Main.printMatrix(zeroedMatrix), Main.printMatrix(matrix));
    }
}
