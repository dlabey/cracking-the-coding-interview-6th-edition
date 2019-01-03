package org.crackingthecodinginterview.chapter01.rotateMatrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void rotateShouldRotate90Degrees() {
        int[][] matrix = new int[][] {
            { 1, 2, 3},
            { 4, 5, 6},
            { 7, 8, 9}
        };
        int[][] rotatedMatrix = new int[][] {
                { 7, 4, 1},
                { 8, 5, 2},
                { 9, 6, 3}
        };

        Main.rotate(matrix);

        String matrixString = Main.printMatrix(matrix);
        String rotatedMatrixString = Main.printMatrix(rotatedMatrix);

        Assertions.assertEquals(rotatedMatrixString, matrixString);
    }
}
