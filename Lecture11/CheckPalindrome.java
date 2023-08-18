package com.DSAWithJava.Lecture11;

public class CheckPalindrome {
    public static void main(String[] args) {
        //String str  = "NOON";
        //String str = "abcda";
        String str = "abcba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        int start = 0 ;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                start ++ ;
                end --;
            } else{
                return false;
            }
        }
        return true;
    }
}
