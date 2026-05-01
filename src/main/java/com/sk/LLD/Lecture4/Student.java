package com.sk.LLD.Lecture4;

public class Student extends User{
    int rollNo;

    public Student(String name, int id) {
        super(name, id);
    }

    public int getRollNo(){
        return rollNo;
    }
}
