/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class TwoDimArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        Scanner input = new Scanner(System.in);

        //scanning first list
        System.out.print("Enter list1: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = input.nextInt();

            }
        }
        //scanning second list
        System.out.print("Enter list2: ");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = input.nextInt();
            }
        }

        //checking if the values of m1 and m2 are equal
        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical.");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    //method that returns true if m1 and m2 are same and false if not
    public static boolean equals(int[][] m1, int[][] m2) {
        int nLength1 = m1.length;
        int nLength2 = m2.length;
        int listLeng1 = m1[0].length;
        int listLeng2 = m2[0].length;

        if (nLength1 != nLength2 || listLeng1 != listLeng2) {
            return false;
        }

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {

                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }

        }

        return true;
    }

}
