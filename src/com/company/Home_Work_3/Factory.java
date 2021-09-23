package com.company.Home_Work_3;

public class Factory {

    private Car car;
    private final String[] models;
    private final int[] engines;
    private final String[] colors;
    private final int[] wheels;
    private OptionsList options;
    private CarWarehouse carWarehouse;
    private Service service;

    public Factory() {
        models  = new String[]{"A4", "A6", "A8", "Model X", "Model S", "X5"};
        engines = new int[]{0, 2, 4};
        colors = new String[]{"Blue", "Green", "Red", "Black", "White"};
        wheels = new int[]{20, 22, 24};
        options = new OptionsList();
        carWarehouse = new CarWarehouse();
        service = new Service();
    }

    public void printModels() {
        for (String model: models) {
            System.out.println(model);
        }
    }

    public boolean checkModels(String model) {
        for (String m: models) {
            if (m.equals(model)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkColors(String color) {
        for (String c: colors) {
            if (c.equals(color)) {
                return true;
            }
        }
        return false;
    }

    public void createCar(String color, String model, int yearManufact, int sizeOfWheels, int engineVolume) {
        if (checkModels(model) && checkColors(color)) {
            this.car = carWarehouse.getAvailableCar(color, model, yearManufact, sizeOfWheels, engineVolume);
        } else if (checkModels(model) && !checkColors(color)) {
            this.car = carWarehouse.getAvailableCar("black", model, yearManufact, sizeOfWheels, engineVolume);
        } else if (!checkModels(model) && checkColors(color)) {
            this.car = carWarehouse.getAvailableCar(color, "A4", yearManufact, sizeOfWheels, engineVolume);
        } else {
            this.car = carWarehouse.getAvailableCar("black", "A4", yearManufact, sizeOfWheels, engineVolume);
        }
    }

    public Car getCar() {
        return car;
    }
}