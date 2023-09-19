package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }
    public Classroom(Student[] students){
        this.students = students;
    }
    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }
    public Double getAverageExamScore(){
        Double sum = 0.0;
        for(int i = 0; i < getStudents().length; i++){
            if (students[i] != null) {
                sum += students[i].getAverageExamScore();
            }
            else{
                break;
            }
        }
        return sum / students.length;
    }
    public void addStudent(Student student){
        for(int i = 0; i < students.length ; i++){
            if(students[i] == null){
                students[i] = student;
                break;
            }
        }
        }
        public void removeStudent(String firstName, String lastName){
        ArrayList<Student> studentArrayList = new ArrayList<>(Arrays.asList(students));
        for(Student student : studentArrayList){
            if(student != null && student.getFirstName() != null && student.getLastName() != null && student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                studentArrayList.remove(student);
                break;
            }
        }
        this.students = studentArrayList.toArray(new Student[0]);
    }
    public Student[] getStudentsByScore(){
        Student[] sortedStudents = this.students;
        System.out.println(Arrays.toString(sortedStudents));
        Student tempObj;

        for (int i = 0; i < sortedStudents.length; i++){
            for (int j = i+1; j < sortedStudents.length; j++){
                if (sortedStudents[i] != null && sortedStudents[j] != null) {

                if(sortedStudents[i].getAverageExamScore() < sortedStudents[j].getAverageExamScore())
                {
                    tempObj = sortedStudents[i];
                    sortedStudents[i] = sortedStudents[j];
                    sortedStudents[j] = tempObj;
                } else if (sortedStudents[i].getAverageExamScore().equals(sortedStudents[j].getAverageExamScore())) {
                   if ((sortedStudents[i].getFirstName() + sortedStudents[i].getLastName()).compareTo(sortedStudents[j].getFirstName() + sortedStudents[j].getLastName()) < 0) {
                       tempObj = sortedStudents[i];
                       sortedStudents[i] = sortedStudents[j];
                       sortedStudents[j] = tempObj;
                   }
                   else {
                       break;
                   }
                   }
                } else {
                    break;
                }
            }
        }
        return sortedStudents;
    }
    public void getGradeBook(){
            Student[] gradeBookList = getStudentsByScore();
            double topGrade = gradeBookList[0].getAverageExamScore();
            double placeHolder;
            for(Student currentStudent : gradeBookList) {
                if (currentStudent == null){
                    break;
                }
                placeHolder = currentStudent.getAverageExamScore();
                if (placeHolder / topGrade >= .90) {
                    System.out.println(currentStudent.getFirstName() + " " + currentStudent.getLastName() + " has a grade average of " + currentStudent.getAverageExamScore() + " and has an A.");
                } else if (placeHolder / topGrade > .70) {
                    System.out.println(currentStudent.getFirstName() + " " + currentStudent.getLastName() + " has a grade average of " + currentStudent.getAverageExamScore() + " and has a B.");
                } else if (placeHolder / topGrade > .50) {
                    System.out.println(currentStudent.getFirstName() + " " + currentStudent.getLastName() + " has a grade average of " + currentStudent.getAverageExamScore() + " and has a C.");
                } else if (placeHolder / topGrade > .11) {
                    System.out.println(currentStudent.getFirstName() + " " + currentStudent.getLastName() + " has a grade average of " + currentStudent.getAverageExamScore() + " and has a D.");
                } else {
                    System.out.println(currentStudent.getFirstName() + " " + currentStudent.getLastName() + " has a grade average of " + currentStudent.getAverageExamScore() + " and has an F.");
                }
            }
    }
}



