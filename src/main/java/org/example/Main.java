package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Double[] examScores = {190.0, 120.0, 90.0, 150.0, 150.0};
        Student student = new Student("Tilmar", "Overbeck", examScores);
        student.getNumberOfExamsTaken();

    }
}
