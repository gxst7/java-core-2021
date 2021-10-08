package com.company.Home_Work_3.for_order;

import com.company.Home_Work_3.car_and_properties.Car;

public class Salon {

    private Factory factory;
    private Service service;

    public Salon() {
        factory = new Factory();
        service = new Service();
    }

    public void orderCar(String color, String model, int yearManufact, int sizeOfWheels, int engineVolume) {
        factory.createCar(color, model, yearManufact, sizeOfWheels, engineVolume);
    }

    public void changeColor(Car car, String color) {
        service.changeColor(car, color);
    }

    void changeWheels(Car car, int wheels) {
        service.changeWheels(car, wheels);
    }

    void addOption(Car car, String option) {
        service.addOption(car, option);
    }

    void deleteOption(Car car, String option) {
        service.deleteOption(car, option);
    }

    public Car getCar() {
        return factory.getCar();
    }
}
