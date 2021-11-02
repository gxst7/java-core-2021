package com.company.reflection;

@Reflectable(name = "box", value = "some object")
public class Box extends AbstractBox implements Printable{

    private String type;

    public String size = "big";

    public Box(int x, int y, int z) {
        super(x, y, z);
        type = "box";
    }

    public Box(int x, int y) {
        super(x, y);
        type = "box second constructor";
    }

    public String getSize() {
        return size;
    }

    public void printNameWithPrefix(String pref) {
        System.out.println(pref + name);
    }

    @Override
    public void print() {
        System.out.println("Box{" + "x=" + x + ", y=" + y + ", z=" + z + ", type=" + type + "}");
    }
}
