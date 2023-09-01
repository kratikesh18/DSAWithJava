package com.DSAWithJava.Lecture16;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(productOfDigits(240));
    }
    static  int productOfDigits(int n ){
        //base case to cheking if the digit is single
        if( n % 10 == n ){
            return  n ;
        }
        return ( n % 10 ) * productOfDigits( n / 10);
    }
}
