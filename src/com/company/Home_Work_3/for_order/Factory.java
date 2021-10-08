package com.company.Home_Work_3.for_order;

import com.company.Home_Work_3.car_and_properties.Car;
import com.company.Home_Work_3.car_and_properties.OptionsList;

public class Factory {

    private final String[] models;
    private final int[] engines;
    private final String[] colors;
    private final int[] wheels;
    private OptionsList options;
    private CarWarehouse carWarehouse;
    private Service service;
    private Car car;

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

    public boolean checkWheels(int wheel) {
        for (int w: wheels) {
            if (w == wheel) {
                return true;
            }
        }
        return false;
    }

    public boolean checkEngines(int engine) {
        for (int e: engines) {
            if (e == engine) {
                return true;
            }
        }
        return false;
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
            car = carWarehouse.getAvailableCar(color, model, yearManufact, sizeOfWheels, engineVolume);
        } else if (checkModels(model) && !checkColors(color)) {
            car =  carWarehouse.getAvailableCar("black", model, yearManufact, sizeOfWheels, engineVolume);
        } else if (!checkModels(model) && checkColors(color)) {
            car = carWarehouse.getAvailableCar(color, "A4", yearManufact, sizeOfWheels, engineVolume);
        } else {
            car = carWarehouse.getAvailableCar("black", "A4", yearManufact, sizeOfWheels, engineVolume);
        }

        if (car.equals(null)) {
            car = new Car(color, model, yearManufact, sizeOfWheels, engineVolume);
        }
    }

    public void changeColor(Car car, String color) {
        service.changeColor(car, color);
    }

    public void changeWheels(Car car, int wheel) {
        service.changeWheels(car, wheel);
    }

    public Car getCar() {
        return car;
    }
}