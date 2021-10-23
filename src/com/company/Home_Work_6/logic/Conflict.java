package com.company.Home_Work_6.logic;

import com.company.Home_Work_6.entity.Country;
import com.company.Home_Work_6.entity.Country_Name;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Conflict {

    private ArrayList<Country> countries = new ArrayList<>();

    // если в мире есть страна, то добавить в список стран, которые конфликтуют
    private void addCountryToConflict(Country_Name country) {
        for (Country_Name name : Country_Name.values()) {
            if (country.equals(name)) {
                countries.add(new Country(country));
            }
        }
    }

    // and return name
    private Country_Name setNameForCountry() {
        String country;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the country that will be involved in the conflict:");
        if (!(country = scanner.nextLine()).equals("")) {
            addCountryToConflict(getName(country));
        } else {
            setNameForCountry();
        }
        return getName(country);
    }

    private Country_Name getName(String name) {
        Country_Name nm;
        switch (name) {
            case "USA":
                nm = Country_Name.USA;
                break;
            case "USSR":
                nm = Country_Name.USSR;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
        return nm;
    }

    public void start() {
        ExecutorService executorCountry = Executors.newCachedThreadPool();
        for (int i = 0; i < countries.size(); i++) {
            executorCountry.execute(new Country(setNameForCountry()));
            if (i == 0) executorCountry.execute(new Factory());
        }
        executorCountry.shutdown();
    }
}
