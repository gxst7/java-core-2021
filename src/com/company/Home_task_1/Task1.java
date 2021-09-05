package com.company.Home_task_1;

/**
 * Задание 1.
 * Есть некоторый массив, состоящий из целых чисел, также есть некоторое
 * число "n". Суть задания посчитать сумму всех элементов массива, однако если
 * в массиве встречается число "n" то в сумму его включать не нужно.
 */
public class Task1 {

    public static void main(String[] args) {
        // the array below acts as "some kind of array"
        int[] array = {1, 2, 3, 5, 8, 13};
        int sum = 0;
        int n = 8;

        for (int element: array) {
            if (element != n) {
                sum += element;
            }
        }
    }
}
