package com.DSAWithJava.Lecture14;

public class XORBetweenRanges {
    public static void main(String[] args) {
        int a = 4;
        int b  = 5;

        int ans = xorsFrom0(b) ^ xorsFrom0(a-1);
        System.out.println(ans);
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
