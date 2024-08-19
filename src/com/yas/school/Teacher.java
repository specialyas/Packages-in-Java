package com.yas.school;

// This class extends AbstractEmployee and implements Teachable
public class Teacher extends AbstractEmployee implements Teachable {
    // Private field for the subject taught
    private String subject;

    // Constructor to initialize the teacher
    public Teacher(String name, int age, double salary, String subject) {
        setName(name);
        setAge(age);
        setSalary(salary);
        this.subject = subject;
    }

    // Getter for the subject
    public String getSubject() {
        return subject;
    }

    // Setter for the subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Implements the teach method from Teachable
    @Override
    public void teach() {
        System.out.println("Teaching " + subject);
    }

    // Implements the prepareLesson method from Teachable
    @Override
    public void prepareLesson() {
        System.out.println("Preparing lesson for " + subject);
    }

    // Implements the gradeAssignments method from Teachable
    @Override
    public void gradeAssignments() {
        System.out.println("Grading assignments for " + subject);
    }

    // Implements the displayInfo method from AbstractPerson
    @Override
    public void displayInfo() {
        System.out.println("Teacher: " + getName() + ", Age: " + getAge() + ", Subject: " + subject);
    }
}
