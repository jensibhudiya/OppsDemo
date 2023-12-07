
package com.mycompany.javatechnous.classcreation.method;


public class method {
    //with constructor method
    public String message;
    public method(String message){//parameterize constructor
        this.message=message;
    }
    public void displayMessage() {//no-arguments method
            System.out.println("Message from this function: " + message);
        }
    public void addAndPrint(int num1, int num2) {//arguments with method 
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args){
    method m= new method("hello java");
    m.addAndPrint(9, 5);
    m.displayMessage();
    }
}

