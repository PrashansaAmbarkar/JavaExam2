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
public enum BurgerCost {
    REGULAR(5,0.01),MEDIUM(8,0.02),LARGE(10,0.04);
    
    private final double price;
    private double percentOff;
   
    
    public double getPrice() {
        return price;
    }

    public double getPercentOff() {
        return percentOff;
    }
    
 

    private BurgerCost(double price, double percentOff) {
        this.price = price;
        this.percentOff = percentOff;
    }
   

   
   
    
}
