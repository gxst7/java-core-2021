package com.company.training;

public class Storage<T> {

    private T value;

    public Storage(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void PRINT_SUM(Storage<? extends Number> valueOne, Storage<? extends Number> valueTwo) {
        System.out.println((valueOne.getValue()).doubleValue() + (valueTwo.getValue()).doubleValue());
    }

    public static boolean COMPARE_STRINGS(Storage<String> strVal1, Storage<String> strVal2) {
        return strVal1.getValue().equals(strVal2.getValue());
    }

    public static void say() {}
}
