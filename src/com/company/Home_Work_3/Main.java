package com.company.Home_Work_3;

import com.company.Home_Work_3.for_order.Salon;

public class Main {

    public static void main(String[] args) {
        Salon salon = new Salon();

        salon.orderCar("blue", "Tesla X", 2020,
                24, 4);

        salon.changeColor(salon.getCar(), "Blue");
        salon.getCar().printInformation();
    }
}
