package com.company.Home_Work_4_project.entity;

import com.company.Home_Work_4_project.entity.OptionList;

public abstract class Car {

    private String color;
    private final String MODEL;
    private final int YEAR_OF_MANUFACT;
    private int sizeOfWheels;
    private final int ENGINE_VOLUME;
    private OptionList list;

    public Car(String color, String MODEL, int YEAR_OF_MANUFACT,
               int sizeOfWheels, int ENGINE_VOLUME, String... options) {
        this.color = color;
        this.MODEL = MODEL;
        this.YEAR_OF_MANUFACT = YEAR_OF_MANUFACT;
        this.sizeOfWheels = sizeOfWheels;
        this.ENGINE_VOLUME = ENGINE_VOLUME;
        this.list = new OptionList(options);
    }

    public abstract void changeColor(String color);

    public abstract void changeSizeOfWheels(int sizeOfWheels);

    public abstract void addOption(String option);

    public abstract void deleteOption(String option);

    public abstract void printOptionsList();

    public void printInformation() {
        System.out.println("Information about car:");
        System.out.println("Color: " + color);
        System.out.println("Model: " + MODEL);
        System.out.println("Year of manufacture: " + YEAR_OF_MANUFACT);
        System.out.println("Size of wheels: " + sizeOfWheels);
        System.out.println("Engine volume: " + ENGINE_VOLUME);
        this.printOptionsList();
    }
}
