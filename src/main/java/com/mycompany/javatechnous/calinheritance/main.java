/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatechnous.calinheritance;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class main {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
         int a=sc.nextInt();
          System.out.println("enter b:");
         int b=sc.nextInt();
        calculation c= new calculation(a,b);
        c.sub();
        c.sum();
    }
    
}
