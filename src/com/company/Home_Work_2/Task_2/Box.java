package com.company.Home_Work_2.Task_2;

public class Box {

    private int length;
    private int width;
    private int depth;
    private String typeOfBox;

    Box() {
        length = 0;
        width = 0;
        depth = 0;
        typeOfBox = "Emptiness...";
    }

    Box(int w, int l) {
        length = l;
        width = w;
        depth = 0;
        typeOfBox = "Envelope";
    }

    Box(int length, int width, int depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
        if (length == width && width == depth) {
            typeOfBox = "Cube";
        } else {
            typeOfBox = "Regular box";
        }
    }

    public String getTypeOfBox() {
        return typeOfBox;
    }
}
