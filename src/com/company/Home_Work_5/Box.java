package com.company.Home_Work_5;

/**
 * Создать класс коробка. Создать 5 объектов. Сериализовать их в файл.
 */
public class Box {

    private int length;
    private int width;
    private int depth;

    Box(int l, int w, int d) {
        length = l;
        width = w;
        depth = d;
    }

    Box(int l, int w) {
        length = l;
        width = w;
        depth = 0;
    }

    Box(int side) {
        length = width = depth = side;
    }

    Box() {
        length = width = depth = 0;
    }
}
