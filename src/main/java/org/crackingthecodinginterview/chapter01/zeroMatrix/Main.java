package org.crackingthecodinginterview.chapter01.zeroMatrix;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void zero(int[][] matrix) {
        List<Integer> col0Indexes = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row] = new int[matrix[row].length];
                    col0Indexes.add(col);
                    break;
                }
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (col0Indexes.contains(col)) {
                    matrix[row][col] = 0;
                }
            }
        }
    }

    static String printMatrix(int[][] matrix) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                stringBuilder.append(matrix[i][j]);
                stringBuilder.append(" ");
                if (j + 1 == matrix[i].length && i + 1 != matrix.length) {
                    stringBuilder.append("\n");
                }
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 1, 2, 3, 0},
                { 4, 5, 8, 6},
                { 0, 8, 9, 9},
                { 1, 2, 1, 1}
        };
        zero(matrix);
        System.out.println(printMatrix(matrix));
    }
}
