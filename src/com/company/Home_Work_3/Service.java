package com.company.Home_Work_3;

class Service {

    void changeColor(Car car, String color) {
        car.changeColor(color);
    }

    void changeWheels(Car car, int sizeOfWheels) {
        car.changeSizeOfWheels(sizeOfWheels);
    }

    void addOption(Car car, String option) {
        car.addOption(option);
    }

    void deleteOption(Car car, String option) {
        car.deleteOption(option);
    }
}
