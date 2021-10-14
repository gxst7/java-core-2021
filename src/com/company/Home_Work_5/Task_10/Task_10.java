package com.company.Home_Work_5.Task_10;

import com.company.Home_Work_5.Task_9.Box;

import java.io.*;
import java.util.ArrayList;

/**
 * Десериализовать объекты из задания #9. Отсортировать их по объёму.
 * Вывести на экран. Записать в файл (OUTPUT.txt) самый большой объем.
 */
public class Task_10 {

    public static void main(String[] args) {

        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("./src/com/company/Home_Work_5/Task_9/Box.ser"));
            FileWriter fw = new FileWriter("./src/com/company/Home_Work_5/Task_10/OUTPUT.txt");
            Box maxBox;

            Object ob1 = os.readObject();
            Object ob2 = os.readObject();
            Object ob3 = os.readObject();
            Object ob4 = os.readObject();
            Object ob5 = os.readObject();

            ArrayList<Box> boxes = new ArrayList<>();
            boxes.add((Box) ob1);
            boxes.add((Box) ob2);
            boxes.add((Box) ob3);
            boxes.add((Box) ob4);
            boxes.add((Box) ob5);

            maxBox = Box.getMaxBox(boxes);
            System.out.println(maxBox);
            fw.write(maxBox.toString());

            os.close();
            fw.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
