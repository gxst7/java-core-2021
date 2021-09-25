package com.company.training_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Holder<T> {

    private LinkedList<T> list;

    public Holder() {
        list = new LinkedList<>();
    }

    public void addElement(T element) {
        list.addLast(element);
        if (list.size() == 6) {
            list.removeFirst();
        }
    }

    @Override
    public String toString() {
        return "Holder{" +
                "list=" + list +
                '}';
    }
}
