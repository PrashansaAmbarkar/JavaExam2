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
public enum Sides {
    FRIES(2),CHICKEN_DRUMSTICKS(3),POPCORN(2),NONE(0);
    
    private final double sidesPrice;
    

    public double getSidesPrice() {
        return sidesPrice;
    }

    
    private Sides(double sidesPrice) {
        this.sidesPrice = sidesPrice;
    }

    
    
    
}
