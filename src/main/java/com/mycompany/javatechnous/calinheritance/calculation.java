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
 **/
public class calculation implements CalSum,CalSub {
    int a;
    int b;
    public calculation(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void sum(){
        System.out.println("sum of a+b:"+(a+b));
    }
    public void sub(){
        System.out.println("submission of a-b:"+(a-b));
    }
}
