/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.text.DecimalFormat;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class Loan {

    private double loanAmount = 2000;
    private double interestRate = 10;
    private int numberOfMonths = 3;
    
    //no arg Constructor
    public Loan() {
    }

    //Method to find the emi of the emi 
    public double getEmi() {
        interestRate = interestRate / (12 * 100);
        double emi = ((loanAmount * interestRate * (Math.pow(1 + interestRate, numberOfMonths))) / (Math.pow(1 + interestRate, numberOfMonths) - 1));
        return emi;
    }
    
    //toString Method
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Loan Amount= $" + loanAmount + ", Interest Rate= " + interestRate + ", Number of Months= " + numberOfMonths + " \nEMI amount= $" + df.format(getEmi());
    }

}
