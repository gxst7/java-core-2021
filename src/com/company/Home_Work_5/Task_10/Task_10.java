package com.company.Home_Work_5.Task_10;

import com.company.Home_Work_5.Task_9.Box;

import java.io.*;

/**
 * Десериализовать объекты из задания #9. Отсортировать их по объёму.
 * Вывести на экран. Записать в файл (OUTPUT.txt) самый большой объем.
 */
public class Task_10 {

    public static void main(String[] args) {

        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("./src/com/company/Home_Work_5/Task_9/Box.ser"));
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/com/company/Home_Work_5/Task_10/OUTPUT.txt"));

            Object ob1 = os.readObject();
            Object ob2 = os.readObject();
            Object ob3 = os.readObject();
            Object ob4 = os.readObject();
            Object ob5 = os.readObject();

            Box box_1 = (Box) ob1;
            Box box_2 = (Box) ob2;
            Box box_3 = (Box) ob3;
            Box box_4 = (Box) ob4;
            Box box_5 = (Box) ob5;

            oos.writeObject(box_1);
            oos.writeObject(box_2);
            oos.writeObject(box_3);
            oos.writeObject(box_4);
            oos.writeObject(box_5);

            os.close();
            oos.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
