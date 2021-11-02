package com.company.reflection;

public class Student {

    private int rating;
    private final String name;
    private final String secondName;

    public Student(int rating, String name, String secondName) {
        this.rating = rating;
        this.name = name;
        this.secondName = secondName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
// создать 3 экземпляра этого класса
    // напечатать
    // изменить знач рейтинга и печать
}
