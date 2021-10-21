package com.company.Home_Work_6.entity;

import java.util.ArrayList;
import java.util.Random;

public class WareHouse {

    private static final ArrayList<RobotParts> robotPartsFromWareHouse = new ArrayList<>();

    private static void deleteRobotPartFromWareHouse(RobotParts robotPart) {
        robotPartsFromWareHouse.remove(robotPart);
    }

    public static void addRobotPartToWareHouse(RobotParts robotPart) {
        robotPartsFromWareHouse.add(robotPart);
    }

    public static RobotParts getRobotPartFromWareHouse(ArrayList<RobotParts> parts) {
        ArrayList<RobotParts> tempParts = new ArrayList<>();
        Random random = new Random();
        RobotParts rp;
        int pos;
        for (RobotParts p : parts) {
            if (robotPartsFromWareHouse.contains(p)) {
                tempParts.add(p);
            }
        }
        try {
            pos = random.nextInt(tempParts.size());
        } catch (IllegalArgumentException e) {
            return null;
        }
        rp = tempParts.get(pos);
        deleteRobotPartFromWareHouse(tempParts.get(pos));
        return rp;
    }
}
