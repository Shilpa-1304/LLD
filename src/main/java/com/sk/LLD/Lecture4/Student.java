package com.sk.LLD.Lecture4;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    int rollNo;
    List<Integer> list =new ArrayList<>();

    public Student(String name, int id) {
        super(name, id);
    }

    public int getRollNo(){
        return rollNo;
    }
}
