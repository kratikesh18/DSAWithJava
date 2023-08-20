package com.DSAWithJava.Lecture13;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("the nth Fib nubmer is : " + fib(n)  );
    }

    static int findFib(int n ){
        if(n ==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int ans1 = findFib(n-1);
        int ans2 = findFib(n-2);

        return ans1 + ans2;
    }

    //another way
    static int fib(int n ){
        if(n < 2){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
}
