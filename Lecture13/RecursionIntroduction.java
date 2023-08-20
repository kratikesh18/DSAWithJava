package com.DSAWithJava.Lecture13;

public class RecursionIntroduction {
    public static void main(String[] args) {
        //printing n numbers
        int n = 5;
    //        printNumbers(n);
        printNumbersRecursively(5);
        System.out.println("Printing numbers Straightly");
        printNumbersStraight(n);
    }
    static void printNumbers(int n){
        printNumber1(n-1);
        System.out.println(n);
    }static void printNumber1(int n){
        printNumber2(n-1);
        System.out.println(n);
    }static void printNumber2(int n){
        printNumber3(n-1);
        System.out.println(n);
    }static void printNumber3(int n){
        printNumber4(n-1);
        System.out.println(n);
    }static void printNumber4(int n){
        System.out.println(n);
    }



//    similarly
    static void printNumbersRecursively(int n ){
        //base case
        if(n == 0){
            return;
        }
        //body
        System.out.println(n);

        //recursive call
        printNumbersRecursively(n-1);
    }

    //similarly at to staright
    static void printNumbersStraight(int n){
        //base case
        if(n == 0){
            return;
        }

        //recursive call
        printNumbersStraight(n-1);
        System.out.println(n);
    }
}
