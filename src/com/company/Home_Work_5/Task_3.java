package com.company.Home_Work_5;

import java.io.*;

/**
 * Необходимо реализовать программу, которая будет считывать
 * числа, введенные пользователем, пока пользователь не введет
 * "стоп" слово. После чего программа выведет среднее из всех
 * введенных значений.
 */
public class Task_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int sum = 0;
        int count = 0;
        double avg;

        System.out.println("Enter numbers for evaluating average value");
        System.out.println("Enter 'stop' to finish");

        try {
            do {
                str = br.readLine();
                if (!str.equals("stop")) {
                    sum += Integer.parseInt(str);
                    count++;
                }
            } while (!str.equals("stop"));

            avg = (double) sum / count;
            System.out.println(avg);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Enter numbers, not words, except you want to stop type 'stop'");
        }
    }
}
