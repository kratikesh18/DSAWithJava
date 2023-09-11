package com.DSAWithJava.Lecture20_QuestionsRecursion;

public class TheSubsetPattern {
    public static void main(String[] args){
        String str = "abc";
        printSubsets("" , str);
    }


    static void printSubsets(String ans , String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        //pick not pick pattern
        printSubsets(ans + ch , str.substring(1));
        printSubsets(ans , str.substring(1));
    }
}
