package com.company.Home_Work_2.Task1;

public class Month {

    public static int getNumberOfMonth(String name) {
        int num;
        switch (name) {
            case "January":
                num = 1;
                break;
            case "February":
                num = 2;
                break;
            case "March":
                num = 3;
                break;
            case "April":
                num = 4;
                break;
            case "May":
                num = 5;
                break;
            case "June":
                num = 6;
                break;
            case "July":
                num = 7;
                break;
            case "August":
                num = 8;
                break;
            case "September":
                num = 9;
                break;
            case "October":
                num = 10;
                break;
            case "November":
                num = 11;
                break;
            case "December":
                num = 12;
                break;
            default:
                num = -1;
                break;
        }
        return num;
    }

    public static String getNameOfMonth(int num) {
        String name;
        switch (num) {
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;
            case 4:
                name = "April";
                break;
            case 5:
                name = "May";
                break;
            case 6:
                name = "June";
                break;
            case 7:
                name = "July";
                break;
            case 8:
                name = "August";
                break;
            case 9:
                name = "September";
                break;
            case 10:
                name = "October";
                break;
            case 11:
                name = "November";
                break;
            case 12:
                name = "December";
                break;
            default:
                name = "Not a month";
                break;
        }
        return name;
    }
}
