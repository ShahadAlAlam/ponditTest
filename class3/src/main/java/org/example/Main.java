package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Class 3 Assignment");
        Student s1 = new Student(1L,"001","Shahad",1L);
        addStudent(s1);
        Student s2 = new Student(2L,"002","Alam",1L);
        addStudent(s2);
        Student s3 = new Student(3L,"003","Shuvo",1L);
        addStudent(s3);
        Student s4 = new Student(4L,"004","Elaf",1L);
        addStudent(s4);
        showStudents();
    }

    public static void addStudent(Student student){
        students.add(student);
        System.out.println(student.toString()+" added to list");
    }

    public static void showStudents(){
        students.forEach(e->{
            System.out.println(e.toString());
        });
    }

}