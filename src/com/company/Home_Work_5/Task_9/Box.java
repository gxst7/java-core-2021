package com.company.Home_Work_5.Task_9;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Создать класс коробка. Создать 5 объектов. Сериализовать их в файл.
 */
public class Box implements Serializable {

    private static transient final long serialVersionUID = 1L;
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

    public int getVolume() {
        return length * width * depth;
    }

    public String getStringVolume() {
        return "" + getVolume();
    }

    public static Box getMaxBox(ArrayList<Box> boxes) {
        Box tempBox = null;
        double temp = 0;
        for (Box box : boxes) {
            if (box.getVolume() > temp) {
                tempBox = box;
                temp = box.getVolume();
            }
        }
        return tempBox;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", depth=" + depth +
                ", volume=" + getVolume() +
                '}';
    }
}
