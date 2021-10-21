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
            ArrayList<Box> ob1 = (ArrayList<Box>) os.readObject();

            maxBox = Box.getMaxBox(ob1);
            System.out.println(maxBox);
            fw.write(maxBox.getStringVolume());

            os.close();
            fw.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
