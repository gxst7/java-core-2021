package com.company.Home_Work_2.Task_4;

/**
 * Задача 4:
 * Необходимо реализовать класс Car, который имеет поля марка и цвет.
 *
 * Марки имеют следующие цвета:
 * Audi - Синий. Красный. Зеленый
 * BMW - Оранжевый. Черный. Фиолетовый
 * KIA - Желтый. Серый. Белый
 *
 * Ожидается метод, который изменяет цвет.
 * Как параметр принимает строку, если цвет не верный,
 * то ничего не изменяет.
 */
public class Task4 {

    public static void main(String[] args) {
        Car car = new Car("Audi");
        car.changeColor("Blue");
    }
}
