package com.yas.school;


// This abstract class implements the Person interface
public abstract class AbstractPerson implements Person {
    // Protected fields for name and age
    protected String name;
    protected int age;

    // Implements the getName method from the Person interface
    @Override
    public String getName() {
        return name;
    }

    // Implements the getAge method from the Person interface
    @Override
    public int getAge() {
        return age;
    }

    // Implements the setName method from the Person interface
    @Override
    public void setName(String name) {
        this.name = name;
    }

    // Implements the setAge method from the Person interface
    @Override
    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method that must be implemented by subclasses
    public abstract void displayInfo();
}
