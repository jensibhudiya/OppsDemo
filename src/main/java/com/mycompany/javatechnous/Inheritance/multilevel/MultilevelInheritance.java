
package com.mycompany.javatechnous.Inheritance.multilevel;

import java.util.Scanner;

public class MultilevelInheritance {
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String name=sc.next();
     System.out.println("enter name:");
     Student S=new Student(name);
     S.hobby();//person class method(base class)
     S.age();//child class method (intermediary class)
     S.study();//student class method(derived class)
     }
     
}