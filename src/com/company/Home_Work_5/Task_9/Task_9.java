package com.company.Home_Work_5.Task_9;

import java.io.*;

/**
 * Создать класс коробка. Создать 5 объектов. Сериализовать их в файл.
 */
public class Task_9 {

    public static void main(String[] args) throws IOException {
        Box box_1 = new Box();
        Box box_2 = new Box(10);
        Box box_3 = new Box(5, 5);
        Box box_4 = new Box(3, 4, 5);
        Box box_5 = new Box(10, 10, 10);

        try {
            FileOutputStream fileStream = new FileOutputStream("./src/com/company/Home_Work_5/Task_9/Box.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);

            os.writeObject(box_1);
            os.writeObject(box_2);
            os.writeObject(box_3);
            os.writeObject(box_4);
            os.writeObject(box_5);

            os.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
