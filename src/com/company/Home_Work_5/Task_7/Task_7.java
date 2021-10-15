package com.company.Home_Work_5.Task_7;

import java.io.*;
import java.util.*;

/**
 * Прочитать файл (INPUT.txt), в выходной файл (OUTPUT.txt) записать все
 * строки из первого, но в обратном порядке (первая строка должна быть последней).
 */
public class Task_7 {

    public static void main(String[] args) {
        LinkedList<String> text = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/com/company/Home_Work_5/Task_7/INPUT.txt"))){
            String temp;
            while ((temp = reader.readLine()) != null) {
                text.add(temp);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/com/company/Home_Work_5/Task_7/OUTPUT.txt"))) {
            for (int i = text.size() - 1; i >= 0; i--) {
                writer.write(text.get(i) + "\n");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
