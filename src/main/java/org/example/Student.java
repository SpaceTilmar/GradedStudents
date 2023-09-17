package org.example;

import java.util.*;

public class Student {
    private String firstName;
    private String lastName;

    private ArrayList<Double> examScores = new ArrayList<>();

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int void getNumberOfExamsTaken() {
        return int this.examScores.size();
    }
    public String getExamScores(){
        String output =
        for(Double score : examScores){
            System.out.println("Exam " + score);
        }
    }


}
