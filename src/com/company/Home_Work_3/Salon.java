package com.company.Home_Work_3;

public class Salon {

    private Factory factory;
    private Service service;

    public Salon() {
        factory = new Factory();
        service = new Service();
    }

    void orderCar(String color, String model, int yearManufact, int sizeOfWheels, int engineVolume) {
        factory.createCar(color, model, yearManufact, sizeOfWheels, engineVolume);
    }

    void changeColor(Car car, String color) {
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

    Car getCar() {
        return factory.getCar();
    }
}
