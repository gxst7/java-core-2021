package com.company.Home_Work_6.entity;

import com.company.Home_Work_6.logic.Factory;

import java.util.ArrayList;
import java.util.Arrays;

public class Country implements Runnable {

    private final Country_Name countryName;
    private int robotsNumberOfTheCountry = 0;
    private final ArrayList<RobotParts> robotPartsOfCountry = new ArrayList<>();
    private final ArrayList<RobotParts> necessaryParts = new ArrayList<>();
    private static boolean isDone = false;

    public Country(Country_Name countryName) {
        this.countryName = countryName;
    }

    private void fillNecessaryPartsList() {
        necessaryParts.addAll(Arrays.asList(RobotParts.values()));
    }

    private void addPlusOneToRobotsNumber() {
        robotsNumberOfTheCountry++;
        if (robotsNumberOfTheCountry == 20) {
            isDone = true;
        }
    }

    private void addRobotPart(RobotParts robopart) {
        if ((robotPartsOfCountry.size() == 5) && (!robotPartsOfCountry.contains(robopart))) {
            fillNecessaryPartsList();
            robotPartsOfCountry.add(robopart);
            addPlusOneToRobotsNumber();
            robotPartsOfCountry.removeAll(Arrays.asList(RobotParts.values()));
        } else if (!robotPartsOfCountry.contains(robopart)) {
            robotPartsOfCountry.add(robopart);
        }
    }

    public static boolean isDone() {
        return isDone;
    }

    public void orderRobotParts() {
        while (!isDone) {
            RobotParts part = Factory.getRobotPartFromFactory(necessaryParts);
            if (part != null) {
                addRobotPart(part);
                necessaryParts.remove(part);
            }
        }
        printResult();
    }

    public void printResult() {
        if (isDone) {
            System.out.println("Winner: " + countryName);
        }
    }

    @Override
    public void run() {
        orderRobotParts();
    }
}
