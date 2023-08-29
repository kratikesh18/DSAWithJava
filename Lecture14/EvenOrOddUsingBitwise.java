package com.DSAWithJava.Lecture14;

import java.util.Scanner;

public class EvenOrOddUsingBitwise {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if( isOdd(n)){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }

    static boolean isOdd(int n){
        return  ( n & 1) == 1;
    }
}
