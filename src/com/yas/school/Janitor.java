package com.yas.school;

// This class extends AbstractEmployee
public class Janitor extends AbstractEmployee {
    // Private field for the shift
    private String shift;

    // Constructor to initialize the janitor
    public Janitor(String name, int age, double salary, String shift) {
        setName(name);
        setAge(age);
        setSalary(salary);
        this.shift = shift;
    }

    // Getter for the shift
    public String getShift() {
        return shift;
    }



    // setter for the shift
    public void setShift(String shift) {
        this.shift = shift;
    }



    // Implements the displayInfo method from AbstractPerson
    @Override
    public void displayInfo() {
        System.out.println("Janitor: " + getName() + ", Age: " + getAge() + ", Shift: " + shift);
    }
}

