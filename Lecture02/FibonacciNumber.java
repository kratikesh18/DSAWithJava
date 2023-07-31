package com.DSAWithJava.Lecture02;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int prev = 0;
        int next = 1;

        int n = input.nextInt();
        int count = 2;
        while (count  <= n ){
            int temp = next;
            next = next + prev ;
            prev = temp;
            count++;
        }

        System.out.println("the fib num is : " + next );
    }
}
