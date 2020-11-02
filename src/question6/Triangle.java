/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;
    private String color;
    private boolean isFilled;

    public Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.isFilled = isFilled;
    }
    
    //Setters and getters
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public String getColor() {
        return color;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    
    //inheriting the abstract method calcArea
    @Override
    public double calcArea() {
        double p=calcPerimeter()/2;
        double value=p*(p-side1)*(p-side2)*(p-side3);
        double area= Math.sqrt(value);
        return area;
    }
    //inherting the abstarct method calcPerimeter
    @Override
    public double calcPerimeter() {
        return side1+side2+side3;
    }
    
    //toString Method
    @Override
    public String toString() {
        return "Side1: " + side1 + ", Side2: " + side2 + ", Side3: " + side3 + ", Color: " + color + ", Is Filled: " + isFilled;
    }
    
}
