package com.company.Home_task_1;

/**
 * Задание 3.
 * Дан некоторый массив, суть задания инвертировать его.
 */
public class Task3 {

    public static void main(String[] args) {
        // the array below acts as "some kind of array"
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
