package com.company.Home_Work_4_project.entity;

public class Truck extends Car {

    private double liftingCapacity;

    public Truck(String color, String MODEL, int YEAR_OF_MANUFACT, int sizeOfWheels, int ENGINE_VOLUME, double liftingCapacity, String... options) {
        super(color, MODEL, YEAR_OF_MANUFACT, sizeOfWheels, ENGINE_VOLUME, options);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void changeColor(String color) {

    }

    @Override
    public void changeSizeOfWheels(int sizeOfWheels) {

    }

    @Override
    public void addOption(String option) {

    }

    @Override
    public void deleteOption(String option) {

    }

    @Override
    public void printOptionsList() {

    }

    @Override
    public void printInformation() {
        System.out.println("Lifting Capacity: " + liftingCapacity);
        super.printInformation();
    }

    @Override
    public String toString() {
        return "Truck{" +
                "liftingCapacity=" + liftingCapacity +
                '}';
    }
}
