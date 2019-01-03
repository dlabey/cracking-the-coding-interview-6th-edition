package org.crackingthecodinginterview.chapter01.rotateMatrix;

public class Main {

    static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false; // Not a square
        int n = matrix.length;

        for (int l = 0; l < n / 2; l++) {
            int lst = n - 1 - l;
            for (int i = l; i < lst; i++) {
                int o = i - l;
                int t = matrix[l][i]; // save top

                // left -> top
                matrix[l][i] = matrix[lst-o][l];

                // bottom -> left
                matrix[lst-o][l] = matrix[lst][lst - o];

                // right -> bottom
                matrix[lst][lst - o] = matrix[i][lst];

                // top -> right
                matrix[i][lst] = t; // right <- saved top
            }
        }
        return true;
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

    // 1 2 3    7 4 1
    // 4 5 6 => 8 5 2
    // 7 8 9    9 6 3
    // rotate by 90 degrees
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 1, 2, 3},
                { 4, 5, 6},
                { 7, 8, 9}
        };
        rotate(matrix);
        System.out.println(printMatrix(matrix));
    }
}
