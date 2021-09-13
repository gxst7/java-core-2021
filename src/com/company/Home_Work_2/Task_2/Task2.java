package com.company.Home_Work_2.Task_2;

/**
 * Задача 2:
 * Задача с классом Box.
 * Необходимо добавить в класс возможность определить тип созданной коробки.
 * 1) Куб (Все стороны равны).
 * 2) Обычная коробка.
 * 3) Конверт (Есть только длинна и ширина).
 */
public class Task2 {

    public static void main(String[] args) {
        Box myBox = new Box();
        Box johnBox = new Box(2, 5);
        Box tonyBox = new Box(3, 4, 5);
        Box emmaBox = new Box(10, 10, 10);
        System.out.println(myBox.getTypeOfBox());
        System.out.println(johnBox.getTypeOfBox());
        System.out.println(tonyBox.getTypeOfBox());
        System.out.println(emmaBox.getTypeOfBox());
    }
}
