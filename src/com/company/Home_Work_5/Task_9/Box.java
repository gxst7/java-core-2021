package com.company.Home_Work_5.Task_9;

import java.io.Serializable;

/**
 * Создать класс коробка. Создать 5 объектов. Сериализовать их в файл.
 */
public class Box implements Serializable {

    private static final long serialVersionUID = 1L;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
