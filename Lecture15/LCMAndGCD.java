package com.DSAWithJava.Lecture15;

public class LCMAndGCD {
    public static void main(String[] args) {
        System.out.println(findGCD(3, 9));
        System.out.println(findLCM(3,7));
    }

    static int findGCD(int a , int b ){
        if(a == 0 ){
            return b ;
        }
        return  findGCD(b % a  , a);
    }

    //finding LCM
    static int findLCM(int a , int b ){
        return  a * b / findGCD(a, b);
    }
}
