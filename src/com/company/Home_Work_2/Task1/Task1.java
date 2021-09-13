package com.company.Home_Work_2.Task1;

/**
 * Задача 1:
 * Задача с месяцами года.
 * Необходимо реализовоть класс который имеет два метода:
 * 1) определить номер месяца по имени.
 * 2) определить имя месяца по номеру.
 */
public class Task1 {

    public static void main(String[] args) {
        System.out.println(Month.getNameOfMonth(7));
        System.out.println(Month.getNumberOfMonth("August"));
    }
}
