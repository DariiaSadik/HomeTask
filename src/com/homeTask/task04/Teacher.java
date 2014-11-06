package com.homeTask.task04;

public class Teacher extends Person{
    String subject;
    double salary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return getName() + ", age: " + getAge() + ", gender: " + getGender()
                + ", subject: " + subject + ", salary: " + salary;
    }
}
