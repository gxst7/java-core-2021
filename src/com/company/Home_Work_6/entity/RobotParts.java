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
        return RobotParts.values()[new Random().nextInt(RobotParts.values().length)];
    }
}
