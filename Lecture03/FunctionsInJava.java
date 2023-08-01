package com.DSAWithJava.Lecture03;

import java.util.Scanner;

public class FunctionsInJava {
    public static void main(String[] args) {
        //learning the functions in java
        greet();


        System.out.print("Enter Your Name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        greetWithName(name);
    }

    static void greet() {
        System.out.println("Hello There! ");
    }
    static  void greetWithName(String pName){
        System.out.println("Hello " + pName);
    }


}
