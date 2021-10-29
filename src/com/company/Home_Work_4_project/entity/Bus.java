package com.company.Home_Work_4_project.entity;

public class Bus extends Car {

    private int passengerCapacity;

    public Bus(String color, String MODEL, int YEAR_OF_MANUFACT, int sizeOfWheels, int ENGINE_VOLUME, int passengerCapacity, String... options) {
        super(color, MODEL, YEAR_OF_MANUFACT, sizeOfWheels, ENGINE_VOLUME, options);
        this.passengerCapacity = passengerCapacity;
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
        System.out.println("Passenger Capacity: " + passengerCapacity);
        super.printInformation();
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerCapacity=" + passengerCapacity +
                '}';
    }
}
