package com.DSAWithJava.Lecture15;

public class SquareRootOfNumber {
    public static void main(String[] args){
        int n = 40;
        int p = 3;
        System.out.println(perfectSqrt(n));

        // O(log(n))
        System.out.println(sqrtBinarySearch(n  ));
        //this will print all decimal values we can format it using pretty printing
        System.out.printf("%.3f " , sqrtBSWithPrecision(n , p));
    }
    static double sqrtBSWithPrecision(int n , int p ){
        //we need start and end for binarySearch
        int s = 0;
        int e = n;

        double root = 0.0 ;

        //binary search
        while(s <= e){
            //finding mid
            int mid = s + (e-s)/2;
            if(mid * mid == n){
                return mid;
            }

            if(mid * mid > n){
                e= mid -1;
            }else{
                s = mid+1;
            }
        }

        //taking increament
        double increament = 0.1;
        for(int i = 0; i<p; i++){
            while(root * root <= n){
                root  = root  + increament;
            }

            //bahar agaya matlb bada hogya toh decrease karo
            root = root - increament;
            increament = increament/10;
        }
        return root ;

    }

    static  int sqrtBinarySearch(int n  ){
        //we need start and end for binarySearch
        int s = 0;
        int e = n;

        int root = 0 ;

        //binary search
        while(s <= e){
            //finding mid
            int mid = s + (e-s)/2;
            if(mid * mid == n){
                return mid;
            }

            if(mid * mid > n){
                e= mid -1;
            }else{
                s = mid+1;
            }
        }

        return root ;

    }
    static int perfectSqrt(int n ){
        int ans = 0;
        for (int i  = 1 ; i<=n ; i++){
            if(n/i == i){
                ans = i;
            }
        }
        return ans;
    }
}
