package com.company.training_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Holder<Integer> holder = new Holder();
        holder.addElement(1);
        holder.addElement(2);
        holder.addElement(3);
        holder.addElement(4);
        holder.addElement(5);

        System.out.println(holder);

        holder.addElement(6);

        System.out.println(holder);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("1st array");
//        list.add("2nd array");
//        list.add("3rd array");
//        list.add("4th array");
//        list.add("5th array");
//
//        System.out.println(list);
//
//
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("1st linked");
//        linkedList.add("2nd linked");
//        linkedList.add("3rd linked");
//        linkedList.add("4th linked");
//        linkedList.add("5th linked");
//
//        System.out.println(linkedList);
//
//        linkedList.remove(0);
//        System.out.println(linkedList);
//
//        linkedList.pollFirst();
//        System.out.println(linkedList);
//
//        linkedList.remove("4th linked");
//        System.out.println(linkedList);
//
//        linkedList.pollLast();
//        System.out.println(linkedList);
//
//        linkedList.add("6th linked");
//        System.out.println(linkedList);
    }
}
