package com.yas.school;


public class SchoolDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Peter", 30, 50000, "Math");
        Student student = new Student("John", 25, "S123", 85.5);
        Principal principal = new Principal("Dr. Eze", 50, 90000, "Science");
        Janitor janitor = new Janitor("Tom", 45, 30000, "Night");
        Administrator admin = new Administrator("Sarah", 35, 60000, "Main Office");

        /*
        teacher.displayInfo();
        teacher.teach();
        teacher.prepareLesson();
        teacher.gradeAssignments();

         */
 /*
         student.displayInfo();
         student.learn();
        student.submitAssignments();
        student.attendClasses();
         student.getEvaluation();
         student.takeExam();
       student.getFeedback();
*/

   /*
         principal.displayInfo();
          principal.teach();
          principal.prepareLesson();
          principal.gradeAssignments();
         principal.getSalary();
*/
         /*
           janitor.displayInfo();
*/
         /*   admin.displayInfo();
          admin.getSalary();
          */
    }
}
