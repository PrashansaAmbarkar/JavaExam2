/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public enum Drinks {
    COKE(1),SPRITE(1),PEPSI(1),SPARKLING_WATER(0.5),WATER(0.0);
    
    private double drinksCost;

    public double getDrinksCost() {
        return drinksCost;
    }

    private Drinks(double drinksCost) {
        this.drinksCost = drinksCost;
    }
    
    
    
    
}
