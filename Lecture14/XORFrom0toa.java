package com.DSAWithJava.Lecture14;

public class XORFrom0toa {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(xorsFrom0(n));
    }
    static int xorsFrom0(int a ){
        if(a%4 == 0 ){
            return a;
        }
        if(a%4 == 1){
            return 1;
        }
        if(a%4 == 2){
            return a+1;
        }
        return 0;
    }
}
