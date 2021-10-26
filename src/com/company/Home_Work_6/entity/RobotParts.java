package com.company.Home_Work_6.entity;

import java.util.Random;

public enum RobotParts {

    LEFT_HAND,
    RIGHT_HAND,
    LEFT_LEG,
    RIGHT_LEG,
    BODY,
    HEAD;

    public static RobotParts getRandomPart() {
        Random random = new Random();
        RobotParts p = RobotParts.values()[random.nextInt(RobotParts.values().length)];
//        System.out.println("RobotPart return: " + p);
        return p;
    }
}