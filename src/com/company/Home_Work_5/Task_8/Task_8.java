package com.company.Home_Work_5.Task_8;

import java.io.*;
import java.util.LinkedList;

/**
 * Имеется два файла (INPUT_1.txt и INPUT_2.txt). В третий (OUTPUT.txt) необходимо
 * записать только те строки, которые есть и в первом, и во втором.
 */
public class Task_8 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader_1 = new BufferedReader(new FileReader("src/com/company/Home_Work_5/Task_8/INPUT_1.txt"));
        BufferedReader reader_2 = new BufferedReader(new FileReader("src/com/company/Home_Work_5/Task_8/INPUT_2.txt"));
        LinkedList<String> inputFile_1 = new LinkedList<>();
        LinkedList<String> inputFile_2 = new LinkedList<>();
        String temp1;
        String temp2;

        while ((temp1 = reader_1.readLine()) != null | (temp2 = reader_2.readLine()) != null) {
            inputFile_1.add(temp1);
            inputFile_2.add(temp2);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/com/company/Home_Work_5/Task_8/OUTPUT.txt"))) {
            for (String i : inputFile_1) {
                for (String j : inputFile_2) {
                    if (i.equals(j)) {
                        writer.write(j + "\n");
                    }
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        reader_1.close();
        reader_2.close();
    }
}
