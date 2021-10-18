package com.company.Home_Work_6.entity;

import java.util.ArrayList;
import java.util.Random;

public class Robot {

    private RobotParts leftHand;
    private RobotParts rightHand;
    private RobotParts leftLeg;
    private RobotParts rightLeg;
    private RobotParts body;
    private RobotParts head;

    public boolean isThereAllParts() {
        return (head.equals(RobotParts.HEAD) &&
                body.equals(RobotParts.BODY) &&
                leftHand.equals(RobotParts.LEFT_HAND) &&
                rightHand.equals(RobotParts.RIGHT_HAND) &&
                rightLeg.equals(RobotParts.RIGHT_LEG) &&
                leftLeg.equals(RobotParts.LEFT_LEG));
    }
}
