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

//Staff sub class extends to employee super class
public class Staff extends Employee{
    private String title;
    
    
    //Constructor
    public Staff(String name, String address, String phoneNumber, String email, String office, String dateHired, double Salary,String title) {
        super(name, address, phoneNumber, email,office, dateHired, Salary);
        this.title = title;
    }
    
    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    //ToString Method
    @Override
    public String toString() {
        return super.toString()+"\nStaff\n" + "Title: " + title;
    }
    
    
}
