package com.company.Home_Work_6.logic;

import com.company.Home_Work_6.entity.Country;
import com.company.Home_Work_6.entity.RobotParts;
import com.company.Home_Work_6.entity.WareHouse;

import java.util.concurrent.TimeUnit;

public class Factory implements Runnable {

    @Override
    public void run() {
        try {
            while (!Country.isDone) {
                makeRobotPart();
                TimeUnit.MILLISECONDS.sleep(5);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void makeRobotPart() {
        WareHouse.addRobotPartToWareHouse();
//        System.out.println("Factory creating robot part");
    }

    public static RobotParts getRobotPart() {
        RobotParts p = WareHouse.getRandomPart();
//        System.out.println("Factory return: " + p);
        return p;
    }
}