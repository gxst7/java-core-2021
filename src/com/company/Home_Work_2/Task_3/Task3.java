package com.company.Home_Work_2.Task_3;

/**
 * Задача 3:
 * Необходимо создать класс который имеет метод чтобы накапливать 5 последних
 * переданных в него цифровых значений. Так же необходимо создать метод который
 * выводит среднее из накопленных значений.
 */
public class Task3 {

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.store(5);
        storage.store(4);
        storage.store(8);
        storage.store(7);
        storage.store(6);
        storage.store(1);
        storage.printAverageValue();
    }
}
