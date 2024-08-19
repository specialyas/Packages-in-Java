package com.yas.school;


// This class extends AbstractStudent and implements Evaluatable
public class Student extends AbstractStudent implements Evaluatable {
    // Private field for the student's grade
    private double grade;

    // Constructor to initialize the student
    public Student(String name, int age, String studentId, double grade) {
        setName(name);
        setAge(age);
        setStudentId(studentId);
        this.grade = grade;
    }

    // Getter for the grade
    public double getGrade() {
        return grade;
    }

    // Setter for the grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Implements the learn method from Learnable
    @Override
    public void learn() {
        System.out.println("Learning...");
    }

    // Implements the submitAssignments method from Learnable
    @Override
    public void submitAssignments() {
        System.out.println("Submitting assignments...");
    }

    // Implements the attendClasses method from Learnable
    @Override
    public void attendClasses() {
        System.out.println("Attending classes...");
    }

    // Implements the getEvaluation method from Evaluatable
    @Override
    public void getEvaluation() {
        System.out.println("Grade: " + grade);
    }

    // Implements the takeExam method from Evaluatable
    @Override
    public void takeExam() {
        System.out.println("Taking exam...");
    }

    // Implements the getFeedback method from Evaluatable
    @Override
    public void getFeedback() {
        System.out.println("Getting feedback...");
    }

    // Implements the displayInfo method from AbstractPerson
    @Override
    public void displayInfo() {
        System.out.println("Student: " + getName() + ", Age: " + getAge() + ", Student ID: " + getStudentId() + ", Grade: " + grade);
    }
}
