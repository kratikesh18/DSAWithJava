package com.DSAWithJava.Lecture16;

public class CountZerosInNumber {
    public static void main(String[] args) {
        int n = 304102100;
        System.out.println(countZeros(n , 0 ));
    }

    static int countZeros(int n , int count ){
        // base case
        if(n == 0 ){
            return  count;
        }

        //checking the remainder is zero if yes then increase the count
        if(n%10 == 0){
            return countZeros(n/10 , count+1);
        }
        return  countZeros(n/10 , count);

    }
}
