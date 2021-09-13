package com.company.Home_Work_1;

/**
 * Задание 2.
 * Суть задания найти сумму всех четных чисел в последовательности Фибоначи, до
 * определенного индекса "n".
 * Например:
 * Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21
 * n = 7
 * Сумма всех четных до 7-го равна 2 + 8 = 10.
 */
public class Task2 {

    public static void main(String[] args) {
        int n = 7;
        int sum = 0;
        int prev = 0;
        int current = 1;

        for (int i = 0; i < n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
            if (current % 2 == 0) {
                sum += current;
            }
        }
        System.out.println(sum);
    }
}
