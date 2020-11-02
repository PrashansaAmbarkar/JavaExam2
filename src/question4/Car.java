/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
//inheritance
public class Car extends Vehicle {

    Vehicle v = new Vehicle(true, 4, 4);    

    //inherting and using polymorphism
    @Override
    public double engineCapacity() {
        return 1500;
    }
    
    
    
    
}
