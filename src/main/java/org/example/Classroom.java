package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    Student[] students;

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
        for(int c = 0; c < getStudents().length; c++){
            sum += students[c].getAverageExamScore();
        }
        return sum / students.length;
    }
    public void addStudent(Student student){
        ArrayList<Student> studentArrayList = new ArrayList<>(Arrays.asList(students));
        studentArrayList.add(student);
         this.students = studentArrayList.toArray(new Student[studentArrayList.size()]);
        }
        public void removeStudent(String firstName, String lastName){
        for(removeStudent : students.length){

        }
        }
    }



