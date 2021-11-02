package com.company.Home_Work_4_project.entity;

public abstract class Car {

    private Colors color;
    private Object MODEL;
    private int YEAR_OF_MANUFACT;
    private Wheels wheel;
    private Engines ENGINE;
    private OptionList list;

    public void setColor(Colors color) {
        this.color = color;
    }

    public abstract void changeColor(Colors color);

    public abstract void changeWheels(Wheels wheel);

    public abstract void addOption(String option);

    public abstract void deleteOption(String option);

    public abstract void printOptionsList();

    public void printInformation() {
        System.out.println("Information about car:");
        System.out.println("Color: " + color);
        System.out.println("Model: " + MODEL);
        System.out.println("Year of manufacture: " + YEAR_OF_MANUFACT);
        System.out.println("Size of wheels: " + wheel);
        System.out.println("Engine volume: " + ENGINE);
        this.printOptionsList();
    }
}
