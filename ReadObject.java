package com.metanit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {
    public static void main(String[] args) {

        ArrayList<Student> list2 = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("Students.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);


            list2 = (ArrayList<Student>) ois.readObject();
            ois.close();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Средняя оценка >= 8 : ");

        int i = 1;
        for (Student x : list2) {
            if (x.getSred() >= 8) {
                System.out.print(i + ". ");
                ++i;
                x.getInfo();
            }
        }
    }
}

