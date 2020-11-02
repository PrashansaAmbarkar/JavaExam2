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

//faculty child/sub class extends to super class employee
public class Faculty extends Employee {
    private int officeHours;
    private int numberOfSubjects;

    //Constructor
    public Faculty(String name, String address, String phoneNumber, String email,String office, String dateHired, double Salary,int officeHours, int numberOfSubjects) {
        super(name, address, phoneNumber, email,office, dateHired, Salary);
        this.officeHours = officeHours;
        this.numberOfSubjects = numberOfSubjects;
    }
    
    //getters and setters
    public int getOfficeHours() {
        return officeHours;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }
    
    //ToString Method
    @Override
    public String toString() {
        return super.toString()+"\nFaculty\n" + "OfficeHours: " + officeHours + ", NumberOfSubjects: " + numberOfSubjects;
    }
    
    
}
