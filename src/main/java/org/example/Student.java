package org.example;

import java.util.*;

public class Student {
    private String firstName;
    private String lastName;

    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
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
    public int getNumberOfExamsTaken() {
        return examScores.size();
    }
    public String getExamScores(){
        String exam = "Exam Scores: \n";

        for(int i = 0; i < examScores.size(); i++){
            exam += "Exams " + (i+1) + "-> " + examScores.get(i) + "\n";
        }
        return exam;

    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }
    public void setExamScores(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
    }
    public Double getAverageExamScore(){
        double sum = 0.0;
        for(int x = 0; x < examScores.size(); x++){
            sum += examScores.get(x);
        }
        return sum / examScores.size();
    }

    @Override
    public String toString() {
        return "Student Name: " + firstName + ' ' +  lastName + "\n" +
                "> Average Score: " + getAverageExamScore() + "\n"
                + "> Exam Scores: " + "\n" + getExamScores();
    }
}
