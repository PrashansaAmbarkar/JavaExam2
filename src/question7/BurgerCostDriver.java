/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.time.DayOfWeek;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class BurgerCostDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        System.out.println("***********BURGER PRICES**********");
        for (BurgerCost burger1 : BurgerCost.values()) {
            System.out.println(burger1.getPrice());
        }
            
        DayOfWeek day=DayOfWeek.TUESDAY;
        System.out.println("\n*****"+day+" PRICES PERCENT OFF*****");
        for(BurgerCost burgers: BurgerCost.values()){
            double priceAfterOff=burgers.getPrice()-(burgers.getPrice()*burgers.getPercentOff());
          System.out.println(priceAfterOff);
        }
        
        System.out.println("\n**********SIDES PRICES*********");
        for (Sides sides : Sides.values()) {
            double sidesCost = sides.getSidesPrice();
            System.out.println(sidesCost);
        }
        
        System.out.println("\n*********DRINKS PRICES*********");
        for (Drinks drinks : Drinks.values()) {
            double drinksCost = drinks.getDrinksCost();
            System.out.println(drinksCost);
        }
    }
}
