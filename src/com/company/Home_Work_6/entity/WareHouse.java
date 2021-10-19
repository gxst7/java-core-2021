package com.company.Home_Work_6.entity;

import java.util.ArrayList;

public class WareHouse {

    private static ArrayList<RobotParts> robotPartsFromWareHouse = new ArrayList<>();

    private void deleteRobotPartFromWareHouse(RobotParts robotPart) {
        robotPartsFromWareHouse.remove(robotPart);
    }

    public static void addRobotPartToWareHouse(RobotParts robotPart) {
        robotPartsFromWareHouse.add(robotPart);
    }
}
