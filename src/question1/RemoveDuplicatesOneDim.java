/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class RemoveDuplicatesOneDim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        //array list for numbers 
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
           int num = scan.nextInt();
           numbers.add(num);
        }
        
        
        //The removeDuplicate method is being invoked
        removeDuplicate(numbers);
        
        System.out.print("The distinct integers are ");
        for(int di=0;di<numbers.size();di++){
            System.out.print(numbers.get(di)+" ");
        }
        System.out.println();
        
        }

    public static void removeDuplicate(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i+ 1 ; j < numbers.size(); j++) {
                int num1 = numbers.get(i);
                int num2 = numbers.get(j);
                if (num1 == num2) {
                    numbers.remove(j);
                }
            }

        }
    }

}
