package com.DSAWithJava.Lecture02;

public class ReversalOfNumber {
    public static void main(String[] args) {
        int n = 654321;

        int revNum = 0;
        while (n > 0){
            int lastdigit = n%10;
            revNum = revNum*10 +lastdigit;
            n = n/10;
        }

        System.out.println(revNum);
    }
}
