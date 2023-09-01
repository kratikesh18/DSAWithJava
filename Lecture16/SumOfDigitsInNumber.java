package com.DSAWithJava.Lecture16;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        int ans = findSum(1342);
        System.out.println(ans);
    }
    static int findSum(int n ){
        //base case
        if(n == 0){
            return 0;
        }
        return   findSum(n/10) + (n%10);
    }
}
