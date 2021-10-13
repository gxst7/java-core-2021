package com.company.Home_Work_5;

import java.io.*;
import java.util.*;

/**
 * Необходимо реализовать программу, которая будет считывать
 * числа, введенные пользователем, пока пользователь не введет
 * "стоп" слово. по команде "статус" необходимо вывести введенные
 * цифры в отсортированном виде.
 */
public class Task_4 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        String str;
        String stopWord = null;
        ArrayList<Integer> numbers = new ArrayList<>();

        pw.println("Enter Stop Word to finish");

        try {
            stopWord = br.readLine();
        } catch (IOException exception) {
            pw.println("Need to enter a stop word");
        }

        pw.println("Enter numbers:");
        try {
            do {
                str = br.readLine();
                if (!str.equals(stopWord)) {
                    if (str.equals("status")) {
                        Collections.sort(numbers);
                        for (int number: numbers) {
                            System.out.print(number + " ");
                        }
                        System.out.println("\nEnter numbers:");
                    } else {
                        numbers.add(Integer.parseInt(str));
                    }
                }
            } while (!str.equals(stopWord));
        } catch (NullPointerException exception) {
            System.out.println("You are entered Ctrl-D (Ctrl-Z)");
        } catch (NumberFormatException exception) {
            System.out.println("Enter a number, not word");
        } catch (IOException exception) {
            System.out.println("Error");
        }
    }
}
