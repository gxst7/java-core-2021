package com.company.Home_task_1;

/**
 * Задание 5.
 * Дан некоторый двумерный массив. Нужно определить, является ли он нижней
 * треугольной матрицей или же нет.
 */
public class Task5 {

    public static void main(String[] args) {
        // the array below acts as "some kind of array"
        int[][] array = {
                        {1, 0, 0, 0},
                        {0, 5, 0, 0},
                        {7, 9, 6, 0},
                        {8, 2, 6, 1}
        };

        // Verification that a square matrix
        for (int[] row: array) {
            if (row.length != array.length) {
                System.out.println("It is not a square matrix");
                return;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                if (i < j) {
                    if (array[i][j] == 0) {
                        continue;
                    } else {
                        System.out.println("This matrix is not triangular");
                        return;
                    }
                }
            }
        }
        System.out.println("This matrix is triangular");
    }
}
