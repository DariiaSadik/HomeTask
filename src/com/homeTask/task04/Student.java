package com.homeTask.task04;

public class Student extends Person{
    String idNumber;
    double gpa;

    public Student(String name, int age, String gender, String idNumber, double gpa) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return getName() + ", age: " + getAge() + ", gender: " + getGender()
                + ", student id: " + idNumber + ", gpa: " + gpa;
    }
}
