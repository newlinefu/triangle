package com.company;

public class Utils {

    public static double[][] multiplyMatrix(double[][] firstMatrix, double[][] secondMatrix) throws Exception {
        if (firstMatrix[0].length != secondMatrix.length) {
            throw new Exception("Умножение невозможно. Недопустимые размеры");
        } else {
            int m = firstMatrix.length;
            int n = secondMatrix[0].length;
            int o = secondMatrix.length;
            double[][] res = new double[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < o; k++) {
                        res[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                }
            }
            return res;
        }
    }


    public static String printMatrix(int[][] matrix) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sb.append(matrix[i][j]).append(' ');
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
