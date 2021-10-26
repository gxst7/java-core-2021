package com.company.Home_Work_6.entity;

import java.util.concurrent.ConcurrentLinkedDeque;

public class WareHouse {

    private static final ConcurrentLinkedDeque<RobotParts> robotPartsFromWareHouse = new ConcurrentLinkedDeque<>();

    public static void addRobotPartToWareHouse() {
        RobotParts p = RobotParts.getRandomPart();
//        System.out.println("add to house " + p);
        robotPartsFromWareHouse.add(p);
    }

    public static RobotParts getRandomPart() {
        if (robotPartsFromWareHouse.isEmpty()) return null;
        RobotParts p = robotPartsFromWareHouse.poll();
//        System.out.println("WareHouse return " + p);
        return p;
    }
}