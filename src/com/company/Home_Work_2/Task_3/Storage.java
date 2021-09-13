package com.company.Home_Work_2.Task_3;

public class Storage {

    private int[] storage;

    Storage() {
        storage = new int[5];
    }

    Storage(int num) {
        storage = new int[num];
    }

    private int calculateAverage() {
        int averageValueOfStorage = 0;
        for (int i = 0; i < storage.length; i++) {
            averageValueOfStorage += storage[i];
        }
        return averageValueOfStorage;
    }

    public void store(int value) {
        int pos;
        for(pos = 0; pos < storage.length - 1; pos++) {
            storage[pos] = storage[pos+1];
        }
        storage[pos] = value;
    }

    public void printAverageValue() {
        System.out.println(calculateAverage() / storage.length);
    }
}
