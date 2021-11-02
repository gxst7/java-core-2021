package com.company.reflection;

public abstract class AbstractBox {

    protected final int x;
    protected final int y;
    protected final int z;

    public String name = "Box";

    public AbstractBox(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public AbstractBox(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }
}
