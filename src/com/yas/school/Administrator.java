package com.yas.school;


public class Administrator extends AbstractEmployee {
    private String office;

    // Constructor to initialize the administrator
    public Administrator(String name, int age, double salary, String office) {
        setName(name);
        setAge(age);
        setSalary(salary);
        this.office = office;
    }

    // getter for the office
    public String getOffice() {
        return office;
    }

    // setter for the  office
    public void setOffice(String office) {
        this.office = office;
    }

    // Implements the displayInfo method from AbstractEmployee
    @Override
    public void displayInfo() {
        System.out.println("Administrator: " + getName() + ", Age: " + getAge() + ", Office: " + office);
    }
}

