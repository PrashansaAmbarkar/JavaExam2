/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Sai Prashansa Ambarkar
 */

//Student child Class/sub class extends to super/parent class
public class Student extends Person {
   private String grade;
   private final String status="Graduate";
   
    //constructor
    public Student( String name, String address, String phoneNumber, String email,String grade) {
        super(name, address, phoneNumber, email);
        this.grade = grade;
    }
    
    //getters and setters
    public String getGrade() {
        return grade;
    }

    public String getStatus() {
        return status;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    //ToString Method
    @Override
    public String toString() {
        return super.toString()+"\nStudent" + "\nGrade: " + grade + ", Status:" + status ;
    }

   
       

   
   
}
