package org.crackingthecodinginterview.chapter01.zeroMatrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 1, 2, 0},
                { 4, 5, 6},
                { 0, 8, 9}
        };
        zero(matrix);
        System.out.println(matrix);
    }
}
