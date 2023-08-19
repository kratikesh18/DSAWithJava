package com.DSAWithJava.Lecture12;

import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args){

        Scanner input  = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        System.out.println("Pattern 1");

        pattern1(n);
    }
    public static void pattern1(int n){
        //printing square pattern of 5 and 5
        for(int i = 0 ;i< n  ; i++){
            for(int j = 0 ; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public   static void pattern2(int n){
        System.out.println("Pattern 2");
        //printing pyramid pattern
        for(int i = 0 ; i<n ; i++){
            //j is going till i +1 in each pass
            for(int j = 0 ;j < i + 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern3(int n){
        System.out.println("Pattern 3rd");
        //loop for n rows
        for(int i = 0 ; i < n ; i++){
            //the cols are decreasing
            for(int j = 0 ; j<n-i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void pattern4(int n ){

        System.out.println("Pattern 4th");
        //loop for rows
        for (int i = 0 ;i<n ;i++){
            for(int j = 0 ; j< i+1 ; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }

    }
    public static void pattern5(int n){
        System.out.println("Pattern 5th");
        for(int i = 0; i<n ;i++){
            //second  loop;
            for(int j = 0; j <i+1 ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i = 0; i <n -1 ; i++){
            for(int j = 0 ; j< n-i-1 ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        System.out.println("Pattern 6th");
        //first loop for rows
        for(int i = 0 ; i < 5 ; i++){
            //for printing spaces which are decreasing with itearation
            for(int j = 0; j<n-i-1; j++){
                System.out.print(' ');
            }
            //another loop for printing stars
            for(int j = 0 ;j < i+1 ; j++){
                System.out.print('*');
            }
            //after printing break the line
            System.out.println();
        }



    }
    public  static void pattern7(int n){
        System.out.println("Pattern 7th");
        //outer looop for rows
        for(int i=0; i < n; i++){
            //first inner loop for spaces
            for(int j = 0; j <i; j++){
                System.out.print(" ");
            }
            //loop for printing stars
            for(int j=0; j<n-i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void pattern8(int n ){
        System.out.println("Pattern 7th");
        //outer looop for rows
        for(int i=0; i < n; i++){
            //first inner loop for spaces
            for(int j = 0; j <i; j++){
                System.out.print(" ");
            }
            //loop for printing stars
            for(int j=0; j<n-i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
