package com.DSAWithJava.Lecture15;

public class IsPrimeOrNot {
    public static void main(String[] args) {
        int n = 20;
        for(int i = 1 ; i <=n  ; i++){
            System.out.println( i + " " + isPrime(i));
        }
    }

    static boolean isPrime(int n){
        if( n <=1){
            return false;
        }

        int count = 2;

        while(count * count <= n){
            if(n % count == 0){
                return false;
            }
            count ++;
        }
        return true;
    }
}
