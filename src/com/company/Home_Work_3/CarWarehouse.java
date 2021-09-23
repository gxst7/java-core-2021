package com.company.Home_Work_3;

public class CarWarehouse {

    private Car[] cars;

    CarWarehouse() {
        cars = new Car[3];
        cars[0] = new Car("red", "Tesla S", 2018,
                24, 0, "coffee machine");
        cars[1] = new Car("green", "Tesla X", 2021,
                24, 0, "coffee machine",
                "rocket booster");
        cars[2] = new Car("blue", "Audi", 2019,
                22, 4);
    }

    public Car getAvailableCar(String color, String model, int yearManufact, int sizeOfWheels, int engineVolume) {
        for (Car car: cars) {
            if (car.compareCars(color, model, yearManufact, sizeOfWheels, engineVolume)) {
                deleteCarFromWarehouse(car);
                return car;
            }
        }
        return new Car(color, model, yearManufact, sizeOfWheels, engineVolume);
    }

    public void deleteCarFromWarehouse(Car car) {
        Car[] delCarArr = new Car[cars.length - 1];
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].compareCars(car)) {
                delCarArr[i] = cars[++i];
            } else {
                delCarArr[i] = cars[i];
            }
        }
        cars = delCarArr;
    }
}
