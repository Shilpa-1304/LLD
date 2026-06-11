package com.sk.LLD.InterviewPrep;

public class OpenNotepad {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("notepad");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}