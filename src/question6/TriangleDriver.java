/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        //Scanning side1
        System.out.print("Enter Side 1: ");
        double side1=scan.nextDouble();
        //Scanning side2
        System.out.print("Enter Side 2: ");
        double side2=scan.nextDouble();
        //Scanning side3
        System.out.print("Enter Side 3: ");
        double side3=scan.nextDouble();
        //Scanning color
        System.out.print("Enter Color: ");
        String color=scan.next();
        //Scanning true/false for filling               
        System.out.print("Is the triangle filled(true/false): ");
        boolean isFilled=scan.nextBoolean();
        
        //tri object
        Triangle tri=new Triangle(side1,side2,side3,color,isFilled);
        
        System.out.println(tri.toString());
        System.out.printf("The Area of the triangle is : %.2f\n",tri.calcArea());
        System.out.printf("The Perimeter of the triangle is : %.2f\n",tri.calcPerimeter());

    }
    
}
