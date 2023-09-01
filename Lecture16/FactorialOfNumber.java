package com.DSAWithJava.Lecture16;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int ans = facto(4);
        System.out.println(ans);
    }

    static  int facto(int n ){
        if(n <= 1) {
            return 1;
        }
        return n * facto(n-1);
    }
}
