package com.DSAWithJava.Lecture16;

public class IsPalindromeForNumber {
    public static void main(String[] args) {
        int n = 122321;
        System.out.println(isPalindrome(n));
    }

    static boolean isPalindrome(int n ){
        return (n == rev(n));
    }

    static int rev(int n ){
        return helper(n , 0 );
    }

    static int helper(int n , int ans ){
        //base case if the  n == 0 then ans is found
        if(n == 0 ){
            return ans;
        }

        // reversing for 1st step
        ans = (ans * 10 )+ (n % 10);

        //recursive call for rest of digits
        return helper(n/10 , ans);
    }
}
