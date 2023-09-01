package com.DSAWithJava.Lecture16;

public class SumOfnNumbers {
    public static void main(String[] args) {
        int ans = sumOfn(5);
        System.out.println(ans);
    }

    static int sumOfn(int n ){
        if (n <=1){
            return  n;
        }
        return  n + sumOfn(n-1);
    }
}
