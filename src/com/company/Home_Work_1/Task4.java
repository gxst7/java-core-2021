package com.company.Home_Work_1;

/**
 * Задание 4.
 * Дан некоторый двумерный массив. Нужно определить каких чисел в нем больше,
 * положительных или отрицательных.
 */
public class Task4 {

    public static void main(String[] args) {
        // the array below acts as "some kind of array"
        int[][] array = {{1, 5, 8}, {0, -10, 1}, {4, -9, -2}};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    continue;
                } else if (array[i][j] > 0) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        if (count > 0) {
            System.out.println("The array contains more positive numbers");
        } else if (count < 0) {
            System.out.println("The array contains more negative numbers");
        } else {
            System.out.println("The array contains the same number " +
                    "of positive and negative numbers");
        }
    }
}
