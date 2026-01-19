package com.company;

import java.sql.SQLOutput;

class student{
    int id;
    int age;
    String gender;

    // Creating Constructor (Constructor is the method always of Same name of class)

    public student()
    {
        id=11;
        age=55;
        gender="Male";

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
public class constructor {
    public static void main(String[] args) {
        student Vishal=new student();
        student Naman= new student();
        Vishal.setId(1);
        Vishal.setAge(33);
        Vishal.setGender("Male");
        System.out.println("Detail of Vishal");
        System.out.println(Vishal.getId());
        System.out.println(Vishal.getAge());
        System.out.println(Vishal.getGender());
        System.out.println("Details of Naman is not set");
        System.out.println(Naman.getId());
        System.out.println(Naman.getAge());
        System.out.println(Naman.getGender());

    }
}

