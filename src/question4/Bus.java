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
public class Bus extends Vehicle {
    
    Vehicle v = new Vehicle(true, 6, 2);

    @Override
    public double engineCapacity() {
        return 7500;    
    }
    
}
