package com.company.training;

public class MainStore {

    public static void main(String[] args) {
        Storage<String> storageStr1 = new Storage<>("hello");
        Storage<String> storageStr2 = new Storage<>("hello");
        Storage<Double> storageInt1 = new Storage<>(10.5);
        Storage<Integer> storageInt2 = new Storage<>(8);

//        Storage.PRINT_SUM(storageInt1, storageInt2);
        System.out.println(Storage.COMPARE_STRINGS(storageStr1, storageStr2));
    }
}
