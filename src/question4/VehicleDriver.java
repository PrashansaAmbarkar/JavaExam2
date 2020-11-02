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
public class VehicleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c = new Car();
        Bus b = new Bus();
        
        //Late Binding and here the method to be called is decided during runtime.
        System.out.println("Engine Capacity of Car: " + c.engineCapacity());
        System.out.println("Engine Capacity of Bus: " + b.engineCapacity());
    }
    
}
