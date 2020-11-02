/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class ArrayListDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> object = new ArrayList<Object>();
        //Loan object
        object.add(new Loan());
        //Date object
        object.add(new Date());
        //String object
        object.add(new String("This is String which is added as an object"));
        //Circle object
        object.add(new Circle());

        for (int i = 0; i < object.size(); i++) {
            System.out.println(object.get(i).toString());
        }

    }

}
