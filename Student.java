package com.metanit;

import java.io.*;


public class Student implements Serializable {
    private String nume;
    private String prenume;
    private String spec;
    private String tel;
    private int num;
    private double sred;
    private int year;

    public Student() {
    }//Пустой конструктор

    public Student(String nume, String prenume, String spec, String tel, int num,
                   double sred, int year) {
        this.nume = nume;
        this.prenume = prenume;
        this.spec = spec;
        this.tel = tel;
        this.num = num;
        this.sred = sred;
        this.year = year;
    }

    public Student(int year) {//Конструктор с одним параметром
        this.year = year;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String Tel) {
        this.tel = tel;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSred() {
        return sred;
    }

    public void setSred(double sred) {
        this.sred = sred;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getInfo() {
        System.out.print("Student : " + "Numarul studentului = " + num +
                ", nume = " + nume +
                ", prenume = " + prenume +
                ", spec = " + spec +
                ", num.tel = " + tel +
                ", nota = " + sred +
                ", anul = " + year + "\n");

    }
}


