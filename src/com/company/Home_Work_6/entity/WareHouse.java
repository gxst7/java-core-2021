package com.company.Home_Work_6.entity;

import java.util.concurrent.ConcurrentLinkedDeque;

public class WareHouse {

    private static final ConcurrentLinkedDeque<RobotParts> robotPartsFromWareHouse = new ConcurrentLinkedDeque<>();

    public static void addRobotPartToWareHouse() {
        robotPartsFromWareHouse.add(RobotParts.getRandomPart());
    }

    public static RobotParts getRandomPart() {
        if (robotPartsFromWareHouse.isEmpty()) return null;
        return robotPartsFromWareHouse.poll();
    }
}
