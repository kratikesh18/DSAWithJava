package com.DSAWithJava.Lecture15;

public class SeiveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        //taking boolean array of size n+1
        boolean[] primes = new boolean[n+1];    //initially all indexes are false
        printPrimes(n ,primes);
    }

    //simple function for PrimeNumbers

    static void printPrimes(int n , boolean[] primes){
        //for loop till squareroot
        for(int i  = 2 ; i*i <= n ; i++){
            //if the ithe value false
            if(!primes[i]){
                //mark all divisibles true that are primes
                for(int j = i*2; j <= n ; j= j+i ){
                    primes[j] = true;
                }
            }
        }

        //Printing the numbers
        for(int i  = 2; i<=n ;i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
