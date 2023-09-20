package com.DSAWithJava.Lecture20_QuestionsRecursion;

import java.util.ArrayList;
import java.util.List;

public class TheSubsetPattern {
    public static void main(String[] args){
        String str = "123";
//        printSubsets("" , str);

//        printSubsets1("" , "abc");
        System.out.println(listSubsets("" , "abc"));
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

    static void printSubsetsWithAscii(String ans , String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        //pick not pick pattern
        printSubsetsWithAscii(ans + ch , str.substring(1));
        printSubsetsWithAscii(ans , str.substring(1));
        printSubsetsWithAscii(ans + (ch+0) , str.substring(1));
    }


    static void printSubsets1(String processed , String unprocessed ){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch  = unprocessed.charAt(0);

        //function calls
        printSubsets1(processed , unprocessed.substring(1));
        printSubsets1(  processed + ch, unprocessed.substring(1));
    }


    static List<String> listSubsets(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            //this list will created and returned by every recursive call
            ArrayList<String> list = new ArrayList<>();
            //adding the base cased subset to the list
            list.add(processed);
            return list;
        }

        //extracting the character
        char ch = unprocessed.charAt(0);
        //the pick not pick pattern logic
        List<String> left = listSubsets(processed, unprocessed.substring(1));
        List<String> right = listSubsets(processed + ch  , unprocessed.substring(1));

        //merging two of the list while returning to the previous function call
        left.addAll(right);
        return left;
    }
}
