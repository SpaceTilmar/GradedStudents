package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.00);
        examScores.add(95.00);
        examScores.add(123.00);
        examScores.add(96.00);
        Student student = new Student("Tilmar", "Overbeck", examScores);
        student.getNumberOfExamsTaken();
        student.addExamScore(60.00);
        student.setExamScores(1, 59.00);

        System.out.println(student.toString());


    }
}
