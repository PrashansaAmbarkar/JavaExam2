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
public class Vehicle {
    private boolean hasWheels;
    private int noOfWheels;
    private int noOfDoors;

    public Vehicle(boolean hasWheels, int noOfWheels, int noOfDoors) {
        this.hasWheels = hasWheels;
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
    }

    public Vehicle() {
    }

    
    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
    
    @Override
    public String toString() {
        return "Vehicle{" + "hasWheels=" + hasWheels + ", noOfWheels=" + noOfWheels + ", noOfDoors=" + noOfDoors + '}';
    }
    
    public double engineCapacity(){
        return 0.0;
    }
    
    
}
