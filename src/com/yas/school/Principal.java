package com.yas.school;


// This class extends AbstractEmployee and implements Teachable
public class Principal extends AbstractEmployee implements Teachable {
    // Private field for the department
    private String department;

    // Constructor to initialize the principal
    public Principal(String name, int age, double salary, String department) {
        setName(name);
        setAge(age);
        setSalary(salary);
        this.department = department;
    }

    // Getter for the department
    public String getDepartment() {
        return department;
    }

    // Setter for the department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Implements the teach method from Teachable
    @Override
    public void teach() {
        System.out.println("Overseeing teaching in the " + department + " department.");
    }

    // Implements the prepareLesson method from Teachable
    @Override
    public void prepareLesson() {
        System.out.println("Preparing strategic plans for the " + department + " department.");
    }

    // Implements the gradeAssignments method from Teachable
    @Override
    public void gradeAssignments() {
        System.out.println("Reviewing academic performance in the " + department + " department.");
    }

    // Implements the displayInfo method from AbstractPerson
    @Override
    public void displayInfo() {
        System.out.println("Principal: " + getName() + ", Age: " + getAge() + ", Department: " + department);
    }
}
