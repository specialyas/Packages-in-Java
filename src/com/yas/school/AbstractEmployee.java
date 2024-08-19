package com.yas.school;



// This abstract class extends AbstractPerson and implements Employable
public abstract class AbstractEmployee extends AbstractPerson implements Employable {
    // Protected field for salary
    protected double salary;

    // Implements the getSalary method from the Employable interface
    @Override
    public double getSalary() {
        return salary;
    }

    // Implements the setSalary method from the Employable interface
    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Implements the getBenefits method from the Employable interface
    @Override
    public void getBenefits() {
        System.out.println("Employee benefits.");
    }
}