/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatechnous.Abstraction;

/**
 *
 * @author Lenovo
 */
public class main {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Using the abstraction to calculate areas
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("hello change");
         System.out.println("hello change");
    }
    
}
