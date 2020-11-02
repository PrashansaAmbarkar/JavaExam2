/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //object for person
        Person p1=new Person("Sai","1101, Street Drive, Apt 6","(666)-123-3345","sai12@gmail.com");
        System.out.println(p1.toString());
        
        System.out.println("***************************************");
        
        //object for student
        Student s1=new Student("Priya","2122, North Drive, Apt 12","(191)-232-1234","priya22@gmail.com","A");
        System.out.println(s1.toString());
        
        System.out.println("***************************************");
        
        //Object for employee
        Employee e1=new Employee("Kiran Raj","1121,Clg Drive,Apt 80","(361)-232-8989","Kiran_raj@gmail.com","International Office","02/12/2004",350);
        System.out.println(e1.toString());
        
        System.out.println("***************************************");
        
        //Object for faculty
        Faculty f1=new Faculty("Uday Sharma","992, School park","(686)-233-3686","uday_krian@gmail.com","Student Admin","10/22/2006",250,15,4);
        System.out.println(f1.toString());
        
        System.out.println("***************************************");
        
        //Object for Staff
        Staff st1=new Staff("Pratyusha Jain","233, Parks lane, Apt 9","(211)-111-2322","pratyusha_121@gmail.com","Graduate Office","08/06/2012",500,"Assistant Proffesor");
        System.out.println(st1.toString());
        
        System.out.println("***************************************");
        
        
    }
    
}
