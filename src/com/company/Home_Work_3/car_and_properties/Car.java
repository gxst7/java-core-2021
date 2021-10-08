package com.company.Home_Work_3.car_and_properties;

public class Car {

    private String color;
    private final String MODEL;
    private final int YEAR_OF_MANUFACT;
    private int sizeOfWheels;
    private final int ENGINE_VOLUME;
    private OptionsList list;

    public Car(String color, String MODEL, int YEAR_OF_MANUFACT,
               int sizeOfWheels, int ENGINE_VOLUME, String... options) {
        this.color = color;
        this.MODEL = MODEL;
        this.YEAR_OF_MANUFACT = YEAR_OF_MANUFACT;
        this.sizeOfWheels = sizeOfWheels;
        this.ENGINE_VOLUME = ENGINE_VOLUME;
        this.list = new OptionsList(options);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void changeColor(String color) {
        if (Properties.checkColor(color)) {
            this.color = color;
        }
    }

    public String getMODEL() {
        return MODEL;
    }

    public int getYEAR_OF_MANUFACT() {
        return YEAR_OF_MANUFACT;
    }

    public int getSizeOfWheels() {
        return this.sizeOfWheels;
    }

    public void setSizeOfWheels(int sizeOfWheels) {
        this.sizeOfWheels = sizeOfWheels;
    }

    public int getENGINE_VOLUME() {
        return ENGINE_VOLUME;
    }

    public void changeSizeOfWheels(int sizeOfWheels) {
        if (Properties.checkWheels(sizeOfWheels)) {
            this.sizeOfWheels = sizeOfWheels;
        }
    }

    public String getListOfOptions() {
        return list.getOptions();
    }

    public void setList(String... list) {
        this.list = new OptionsList(list);
    }

    public void addOption(String option) {
        list.addOption(option);
    }

    public void deleteOption(String option) {
        list.deleteOption(option);
    }

    public void printOptionsList() {
        System.out.println(this.getListOfOptions());
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", MODEL='" + MODEL + '\'' +
                ", YEAR_OF_MANUFACT=" + YEAR_OF_MANUFACT +
                ", sizeOfWheels=" + sizeOfWheels +
                ", ENGINE_VOLUME=" + ENGINE_VOLUME +
                ", list=" + list +
                '}';
    }

    // Print information about car (with list of options)
    public void printInformation() {
        System.out.println("Information about car:");
        System.out.println("Color: " + color);
        System.out.println("Model: " + MODEL);
        System.out.println("Year of manufacture: " + YEAR_OF_MANUFACT);
        System.out.println("Size of wheels: " + sizeOfWheels);
        System.out.println("Engine volume: " + ENGINE_VOLUME);
        this.printOptionsList();
    }

    public boolean compareCars(String color, String model, int yearManufact, int sizeOfWheels, int engineVolume) {
        return this.color.equals(color) && this.MODEL.equals(model)
                && this.sizeOfWheels == sizeOfWheels && this.YEAR_OF_MANUFACT == yearManufact;
    }

    public boolean compareCars(Car car) {
        return this.color.equals(car.getColor()) && this.MODEL.equals(car.getMODEL())
                && this.sizeOfWheels == car.getSizeOfWheels() && this.YEAR_OF_MANUFACT == car.getYEAR_OF_MANUFACT();
    }
}
