package com.company.Home_Work_3.logic;

import com.company.Home_Work_3.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarWarehouse {

    private List<Car> cars = new ArrayList<>();

    CarWarehouse() {
        cars.add(new Car("red", "Tesla S", 2018,
                24, 0, "coffee machine"));
        cars.add(new Car("green", "Tesla X", 2021,
                24, 0, "coffee machine",
                "rocket booster"));
        cars.add(new Car("blue", "Audi", 2019,
                22, 4));
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
        for (Car theCar: cars) {
            if (theCar.compareCars(car)) {
                cars.remove(car);
            }
        }
    }
}
