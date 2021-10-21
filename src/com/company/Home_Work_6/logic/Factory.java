package com.company.Home_Work_6.logic;

import com.company.Home_Work_6.entity.Country;
import com.company.Home_Work_6.entity.RobotParts;
import com.company.Home_Work_6.entity.WareHouse;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Factory implements Runnable {

    @Override
    public void run() {
        try {
            while (!Country.isDone()) {
                System.out.println("Start making parts of robots");
                makeRobotPart();
                TimeUnit.MILLISECONDS.sleep(5);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void makeRobotPart() {
        Random randomIntForParts = new Random();
        RobotParts[] arrayRobotParts = {RobotParts.BODY, RobotParts.HEAD,
                RobotParts.LEFT_HAND, RobotParts.RIGHT_HAND, RobotParts.LEFT_LEG,
                RobotParts.RIGHT_LEG};
        int pos = randomIntForParts.nextInt(arrayRobotParts.length);
        WareHouse.addRobotPartToWareHouse(arrayRobotParts[pos]);
    }

    public static RobotParts getRobotPartFromFactory(ArrayList<RobotParts> necessaryParts) {
        return WareHouse.getRobotPartFromWareHouse(necessaryParts);
    }
}
