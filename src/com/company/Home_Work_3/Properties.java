package com.company.Home_Work_3;

public class Properties {

    public static final String[] COLORS = {"Blue", "Green", "Red", "Black", "White", "Purple", "Gray"};
    public static final String[] MODELS = {"A4", "A6", "A8", "Model X", "Model S", "X5"};
    public static final int[] ENGINES = {0, 2, 3, 4, 5};
    public static final int[] WHEELS = {18, 19, 20, 21, 22, 23, 24};

    public static boolean checkColor(String color) {
        for (String clr: COLORS) {
            if (clr.equals(color)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkModel(String model) {
        for (String mdl: MODELS) {
            if (mdl.equals(model)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkEngine(int engine) {
        for (int eng: ENGINES) {
            if (eng == engine) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkWheels(int wheels) {
        for (int wls: WHEELS) {
            if (wls == wheels) {
                return true;
            }
        }
        return false;
    }
}
