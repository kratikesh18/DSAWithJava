package com.DSAWithJava.Lecture02;

import java.util.Scanner;

public class UpperCasaeLowerCase {
    public static void main(String[] args) {
        //taking input char
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if(ch >='a' && ch <= 'z'){
            System.out.println("LowrCase");
        }
        else{
            System.out.println("UpperCase");
        }
    }
}
