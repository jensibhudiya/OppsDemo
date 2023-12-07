/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatechnous.Inheritance.hierarchical;

import java.util.Scanner;

public class hierarchicalInheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter manager name:");
        String m_name=sc.next();
        Manager m= new Manager(m_name);//child class object create
        System.out.println("enter student name:");
        String s_name=sc.next();
        Student s= new Student(s_name);//child class object create
        System.out.println("enter teacher name:");
        String t_name=sc.next();
        Teacher t = new Teacher(t_name);//child class  object create
        
        m.hobby();//parent class method
        m.print_manager();//child class method
        m.addname();
        s.hobby();//parent class method
        s.print_student();//child class method
        s.addname();
        t.hobby();//parent class method
        t.print_teacher();//child class method
        t.addname();
    }
}
