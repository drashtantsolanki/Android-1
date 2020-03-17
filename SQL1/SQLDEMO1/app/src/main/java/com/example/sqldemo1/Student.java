package com.example.sqldemo1;

public class Student {
    int studentId;
    String studentName,studentCity,studentEmail;

    public Student() {
    }

    public Student(String studentName, String studentCity, String studentEmail) {
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.studentEmail = studentEmail;
    }

    public Student(int studentId, String studentName, String studentCity, String studentEmail) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.studentEmail = studentEmail;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
}
