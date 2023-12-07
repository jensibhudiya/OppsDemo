/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatechnous.Polymorphism.methodoverloading;

import static com.mycompany.javatechnous.Polymorphism.methodoverloading.MethodOverloadingExample.add;
//import package
import static com.mycompany.javatechnous.Polymorphism.methodoverloading.MethodOverloadingExample.concatenate;


public class main {
    public static void main(String[] args) {
        // Calling overloaded methods
        System.out.println("Sum (int): " + add(5,10));
        System.out.println("Sum (int): " + add(5, 10, 15));
        System.out.println("Sum (double): " + add(3.5, 2.5));
        System.out.println("Concatenation: " + concatenate("Hello, ", "world!"));
    } 
}
