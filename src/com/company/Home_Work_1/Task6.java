package com.company.Home_Work_1;

/**
 * Задание 6.
 * Даны две квадратные матрицы. Необходимо написать программу,
 * которая посчитает их сумму и разности.
 */
public class Task6 {

    public static void main(String[] args) {
        // the arrays below acts as "some kind of arrays"
        int[][] matrixA = {
                {5, -7, 9},
                {8, 0, -2},
                {-4, 2, 0}
        };
        int[][] matrixB = {
                {9, 1, 0},
                {0, 8, 3},
                {1, 7, 6}
        };
        int[][] sumOfMatrices;
        int[][] subtractOfMatrices;

        // Verification that both of matrices are square and same dimension
        if (matrixA.length == matrixB.length) {
            for (int i = 0; i < matrixA.length; i++) {
                if (matrixA[i].length != matrixA.length || matrixA.length != matrixB[i].length) {
                    System.out.println("They are not same square matrices");
                    return;
                }
            }
        } else {
            System.out.println("They are not same square matrices");
            return;
        }

        sumOfMatrices = new int[matrixA.length][matrixA.length];
        subtractOfMatrices = new int[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                sumOfMatrices[i][j] = matrixA[i][j] + matrixB[i][j];
                subtractOfMatrices[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
    }
}
