
package com.mycompany.javatechnous.Encapsulation;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter age:");
        int age=sc.nextInt();
        //create object
        ExampleEncapsulation person = new ExampleEncapsulation();
        // Accessing and modifying the private variable through public methods
        person.setAge(age);
        System.out.println("Age: " + person.getAge());

        // Attempting to set a negative age (will be ignored)
    }
}
