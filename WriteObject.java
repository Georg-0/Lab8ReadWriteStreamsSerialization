package com.metanit;

import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObject {

    public static void main(String[] args) {
        ArrayList<com.metanit.Student> list1 = new ArrayList<>();

        list1.add(new Student("Petru", "Allien", "BA", "042314", 12, 4.6, 3));
        list1.add(new Student("Vlad", "Tepes", "Ab", "0233212", 11, 10.0, 1));
        list1.add(new Student("Stefan", "Maga", "BAb", "8-800-5-35-35-35", 10, 9.8, 1));
        list1.add(new Student("Lionelia", "Mesi", "Lal", "5844323", 9, 7.3, 2));
        list1.add(new Student("Cristina", "Pop", "Infa", "2345512", 55, 5.4, 2));
        list1.add(new Student("John", "Lenon", "Mus", "055554", 8, 8, 3));
        list1.add(new Student("Billie", "Joe", "Mus", "0992123", 7, 8.44, 3));
        list1.add(new Student("Ted", "Рузвельт", "His", "06334532", 6, 7.5, 3));
        list1.add(new Student("Maaman", "Awesome", "Joke", "022022202", 5, 5.55, 2));
        list1.add(new Student("Travis", "Johnson", "Infa", "0033312", 4, 6.4, 2));
        list1.add(new Student("Petr", "Kien", "BA", "042314", 3, 4.6, 3));
        list1.add(new Student("Glad", "Vepes", "Ab", "0233212", 2, 6.0, 1));
        list1.add(new Student("Stefan", "Daga", "BAb", "8-800-5-35-35-35", 14, 9.8, 1));
        list1.add(new Student("Lionelia", "Lesi", "Lal", "5844323", 22, 7.3, 2));
        list1.add(new Student("Tristina", "Gop", "Infa", "2345512", 53, 5.4, 2));


        Iterator<Student> iter = list1.iterator(); //Использование итератора

        System.out.println("ArrayList:");
        while (iter.hasNext()) {                      //Использование итератора
            Student student = iter.next();
            student.getInfo();
            if (!iter.hasNext()) {
                System.out.println();
            }


            try {
                FileOutputStream fos = new FileOutputStream("Students.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeObject(list1);

                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

