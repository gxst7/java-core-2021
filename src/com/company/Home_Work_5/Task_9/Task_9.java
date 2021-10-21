package com.company.Home_Work_5.Task_9;

import java.io.*;
import java.util.ArrayList;

/**
 * Создать класс коробка. Создать 5 объектов. Сериализовать их в файл.
 */
public class Task_9 {

    public static void main(String[] args) throws IOException {
        ArrayList<Box> savedBoxes = new ArrayList<>();
        savedBoxes.add(new Box());
        savedBoxes.add(new Box(10));
        savedBoxes.add(new Box(5, 5));
        savedBoxes.add(new Box(3, 4, 5));
        savedBoxes.add(new Box(10, 10, 10));

        try {
            FileOutputStream fileStream = new FileOutputStream("./src/com/company/Home_Work_5/Task_9/Box.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);

            os.writeObject(savedBoxes);
            os.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
