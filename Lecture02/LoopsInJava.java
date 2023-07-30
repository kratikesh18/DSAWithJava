package com.DSAWithJava.Lecture02;

import java.util.Scanner;

public class LoopsInJava {
    public static void main(String[] args) {

        //printing string 5 times with loop
        for(int i = 0 ;i < 5 ; i++){
            System.out.println("Hello kartikesh");
        }
        //printing numbers from 1 to 5;
        for(int i = 1 ; i <=5 ; i++){
            System.out.print(i + " ");
        }

        // print numbers from 1 to n ;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter value of n: ");
        int n = input.nextInt();

        for(int i = 1 ; i <= n ; i++){
            System.out.print(i + " ");
        }

        //Performing While loop
        int count = 1;
        while(count <=10) {
            System.out.println(count);
            count++;
        }

        // performing do while
        int num  = 1;
        do{
            System.out.println(num);
            num++;
        }while (num <=6);
    }
}
