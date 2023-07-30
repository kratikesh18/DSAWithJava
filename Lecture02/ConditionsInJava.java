package com.DSAWithJava.Lecture02;

import java.util.Scanner;

public class ConditionsInJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Age : ");
        int age = input.nextInt();

        if(age >=18){
            System.out.println("You can Drive ");
        }
        else{
            System.out.println("You cannot Drive");
        }

        System.out.print("Enter Your Salary: ");
        int salary = input.nextInt();

        if(salary < 10000){
            salary += 2000;
        } else if (salary < 15000) {
            salary  += 1000;
        }
        else {
            salary += 500;
        }

        System.out.println(salary);
    }
}
