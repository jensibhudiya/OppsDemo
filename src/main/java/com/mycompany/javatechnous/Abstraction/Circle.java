package com.mycompany.javatechnous.Abstraction;

public class Circle extends Shape{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
