package com.ligaoxiang.entity;

import java.util.Objects;

public class Student {
    private String studentID;
    private String name;
    private int age;
    private double score;

    public Student(String studentID, String name, int age, double score) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.score = score;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.score, score) == 0 &&
                Objects.equals(studentID, student.studentID) &&
                Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public double getScore() {
        return score;
    }

    public int getAge() {

        return age;
    }

    public String getName() {

        return name;
    }

    public String getStudentID() {

        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
