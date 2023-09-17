package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.00);
        examScores.add(95.00);
        examScores.add(123.00);
        examScores.add(96.00);
        Double[] examScores2 = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student("Tilmar", "Overbeck", examScores2);
        Student student1 = new Student("Billy" ,"Bob", examScores2);
        Classroom classroom = new Classroom();
        classroom.addStudent(student1);
        student.getNumberOfExamsTaken();
        student.addExamScore(60.00);
        student.setExamScores(1, 59.00);
        classroom.addStudent(student);
        System.out.println(classroom.getAverageExamScore());
        System.out.println(student.toString());


    }
}
