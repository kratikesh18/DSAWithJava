package com.DSAWithJava.Lecture01;

public class TypeCastingAndConversion {
    public static void main(String[] args) {
        //typecasting in java
        int n  = (int) (24.42f);
        System.out.println(n);

        //automatic type promotion in expressions
        byte b =(byte) (257);       //it it printing 257 % 256 = 1 ;
        System.out.println(b);

        int number = 'a';
        System.out.println(number); //this will print 97




    }
}
