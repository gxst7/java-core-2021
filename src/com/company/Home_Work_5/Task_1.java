package com.company.Home_Work_5;

import java.io.*;

/**
 * Необходимо реализовать программу, которая будет считывать
 * строки, введенные пользователем и выводить их в консоль.
 */
public class Task_1 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter some strings of text");
        System.out.println("Enter nothing to finish");
        try {
            do {
                str = br.readLine();
                if (!str.equals("")) {
                    System.out.println(str);
                }
            } while (!str.equals(""));
        } catch (NullPointerException | IOException exception) {
            System.out.println("You are entered Ctrl-D (Ctrl-Z)");
        }
    }
}
