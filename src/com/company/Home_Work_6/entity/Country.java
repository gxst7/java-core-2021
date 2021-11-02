package com.company.Home_Work_6.entity;

import com.company.Home_Work_6.logic.Factory;

import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Country implements Runnable {

    private String countryName;
    private int robotsNumberOfTheCountry = 0;
    private ConcurrentLinkedDeque<RobotParts> parts = new ConcurrentLinkedDeque<>();
    private ScheduledFuture t;
    public static volatile boolean isDone = false;          // atomic boolean



    public Country(ScheduledFuture<?> t) {
        setCountryName();
        this.t = t;
    }

    private void setCountryName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the country that will be involved in the conflict:");
        if (scanner.hasNextLine()) {
            countryName = scanner.nextLine();
        } else {
            setCountryName();
        }
    }

    public void orderRobotParts() throws InterruptedException {
        while (robotsNumberOfTheCountry != 20) {
            RobotParts part = Factory.getRobotPart();
//            TimeUnit.MILLISECONDS.sleep(5);
            if (part != null && !parts.contains(part)) {
                parts.add(part);
                if (parts.size() == 6) {
                    robotsNumberOfTheCountry++;
                    parts = new ConcurrentLinkedDeque<>();
                    System.out.println(countryName + " : " + robotsNumberOfTheCountry + " : " + part);
                }
            }
        }
        System.out.println("Winner: " + countryName);
        t.cancel(true);
    }

    @Override
    public void run() {
        try {
            orderRobotParts();
        } catch (InterruptedException e) {
            System.out.println("error");
        }
    }
}