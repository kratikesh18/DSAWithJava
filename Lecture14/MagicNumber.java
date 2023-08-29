package com.DSAWithJava.Lecture14;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 1;
        int ans = 0 ;
        int base =5 ;
        while( n > 0){
            //finding the last digit
            int last = n&1;
            //shifting last digit
            n = n >> 1 ;
            ans += base * last;
            base *=5;
        }
        System.out.println(ans);
    }
}
