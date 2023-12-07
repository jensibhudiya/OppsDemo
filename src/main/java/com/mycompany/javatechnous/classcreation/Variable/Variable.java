/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatechnous.classcreation.Variable;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Variable {
    //***********primitive datatype*******************
    
    //integer datatype to declare variable
    byte myByte = 3;      // 8-bit signed integer
    short myShort = 5;    // 16-bit signed integer
    int myInt = 10;      // 32-bit signed integer
    long myLong = 100l;   // 64-bit signed integer,long datatype in declare l or L
    
    
    //float datatype to  declare variable
    float myFloat = 3.14f;    // 32-bit floating point,float datatype in declare F or f 
    double myDouble = 2.718D;  // 64-bit floating point,double datatype in declare D or d

    //character datatype to declare variable
       
    static char myChar;// 16-bit Unicode character
    public static void main(String[]args){
        Variable v=new Variable();//create new object
        Scanner sc=new Scanner(System.in);
        System.out.println("****integer datatype****");
        System.out.println("byte:"+v.myByte);
        System.out.println("short:"+v.myShort);
        System.out.println("integer:"+v.myInt);
        System.out.println("long:"+v.myLong);
        System.out.println("****floating datatype****");
        System.out.println("float:"+v.myFloat);
        System.out.println("double:"+v.myDouble);
        System.out.println("****character datatype****");
        System.out.println("enter character:");
        myChar=sc.next().charAt(0);
        System.out.println("char:"+v.myChar);
    }
    
}
