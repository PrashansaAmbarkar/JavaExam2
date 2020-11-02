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
public class Circle {

    public int radius = 4;
    public double area;
    public double perimeter;

    //no arg Constructor
    public Circle() {
    }
    
    //method to get area of a circle
    public double getArea() {
        area = radius * radius * Math.PI;
        return area;
    }
    
    //method to get perimeter of circle
    public double getPerimeter() {
        perimeter = (2 * radius) * (Math.PI);
        return perimeter;
    }
    
    //ToString Method
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Circle's Area and Perimeter when the radius is " + radius + " = " + df.format(getArea()) + " and " + df.format(getPerimeter());
    }

}
