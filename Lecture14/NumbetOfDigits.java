package com.DSAWithJava.Lecture14;

public class NumbetOfDigits {
    public static void main(String[] args) {
        //finding the number of digits in base b
        int n = 6;
        int b = 2;
        int ans = (int)(Math.log(n) /Math.log(b) )+1;
        System.out.println(ans);
    }
}
