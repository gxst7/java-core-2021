package com.company.Home_Work_2.Task_4;

public class Car {

    private String brand;
    private String color;

    Car(String brand) {
        this.brand = brand;
    }

    public void changeColor(String color) {
        switch (brand.toUpperCase()) {
            case "AUDI":
                switch (color.toLowerCase()) {
                    case "blue":
                    case "red":
                    case "green":
                        this.color = color;
                    default:
                        break;
                }
                break;
            case "BMW":
                switch (color.toLowerCase()) {
                    case "orange":
                    case "black":
                    case "purple":
                        this.color = color;
                    default:
                        break;
                }
                break;
            case "KIA":
                switch (color.toLowerCase()) {
                    case "yellow":
                    case "gray":
                    case "white":
                        this.color = color;
                    default:
                        break;
                }
                break;
        }
    }
}
