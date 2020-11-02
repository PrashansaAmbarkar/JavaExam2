/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class One {

    private int a;

    public One(int in) {
        a = in; //this.a
    }

    public int guess(int x) {
        System.out.println("One guess " + x);// Guess method 
        return a + x;
    }

    public int apply(int x) {
        System.out.println("One guess " + x);
        return guess(x + 3);
    }
} // end class One

