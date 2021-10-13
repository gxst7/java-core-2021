package com.company.Home_Work_5;

import java.io.*;

/**
 * Необходимо реализовать программу, которая будет считывать
 * строки, введенные пользователем и выводить их в консоль.
 */
public class Task_1 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        String str;
        pw.println("Enter some strings of text");
        pw.println("Enter nothing to finish");
        try {
            do {
                str = br.readLine();
                if (!str.equals("")) {
                    pw.println(str);
                }
            } while (!str.equals(""));
        } catch (NullPointerException | IOException exception) {
            System.out.println("You are entered Ctrl-D (Ctrl-Z)");
        }
    }
}