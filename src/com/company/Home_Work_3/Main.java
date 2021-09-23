package com.company.Home_Work_3;

public class Main {

    public static void main(String[] args) {
        Salon salon = new Salon();

        salon.orderCar("blue", "Tesla X", 2020,
                24, 4);

        salon.changeColor(salon.getCar(), "sdf");
        salon.getCar().printInformation();
    }
}
