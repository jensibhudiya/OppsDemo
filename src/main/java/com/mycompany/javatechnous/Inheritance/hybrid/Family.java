package com.mycompany.javatechnous.Inheritance.hybrid;

public class Family {
    public static  void main(String[] args){
        Daughter d=new Daughter();
        son s=new son();
        father f=new father();
        Grandfather g=new Grandfather();
        g.showgrandparent();//parent class
        f.showgrandparent();//intermidiate class
        d.showgrandparent();//child class
        d.showparent();
        d.showdau();
        s.showgrandparent();//child class
        s.showparent();
        s.showson();
    }
}
