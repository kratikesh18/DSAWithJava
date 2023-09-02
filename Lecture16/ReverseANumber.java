package com.DSAWithJava.Lecture16;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 2679;
        //int ans = reverseIteratively(n);
        int ans = reverse(n);
        System.out.println(ans);
    }
    static int reverseIteratively(int n ){
        int ans =  0 ;
        while(n > 0){
            ans = (ans*10) + (n%10);
            n /= 10;
        }
        return ans;
    }
    static int reverse(int n){
        return helperFunction(n  , 0 );
    }

    static int helperFunction(int n , int ans){
        //BaseCase if the number is 0 then return the ans which is made by logic
        if(n == 0 ){
            return  ans ;
        }
        //1st step which is essential for reversing
        ans = ans*10 + n%10 ;
        //the recursive call which is removing the last digit
        return helperFunction(n/10 , ans);
    }
}
