package com.DSAWithJava.Lecture14;

public class PowerOf2OrNot {
    public static void main(String[] args) {
        int n = 32;
        boolean ans =( n & (n-1)) ==0 ;
        System.out.println(ans);
    }
}
