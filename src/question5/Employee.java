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
//Employee is child class for person and parent class for faculty and staff
public class Employee extends Person{
    
    private String office;
    private String dateHired;
    private double salary;
    
    //constructor
    public Employee(String name, String address, String phoneNumber, String email,String office, String dateHired, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.dateHired = dateHired;
        this.salary = salary;
    }
    
    //getters and setters
    public String getOffice() {
        return office;
    }

    public String getDateHired() {
        return dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    //ToString Method
    @Override
    public String toString() {
        return super.toString()+"\nEmployee\n" + "Office: " + office + ", DateHired: " + dateHired + ", Salary: $" + salary;
    }
  
    
    
}
