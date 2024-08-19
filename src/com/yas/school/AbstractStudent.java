package com.yas.school;


// This abstract class extends AbstractPerson and implements Learnable
public abstract class AbstractStudent extends AbstractPerson implements Learnable {
    // Protected field for student ID
    protected String studentId;

    // Getter for student ID
    public String getStudentId() {
        return studentId;
    }

    // Setter for student ID
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
