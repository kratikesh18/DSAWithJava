package com.DSAWithJava.Lecture20_QuestionsRecursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
    public static void main(String[] args){
//        printPermutation("" , "abc");
        printPermutation("" , "abc");
        System.out.println(listPermutations("" , "abc"));
    }


    static void printPermutation(String updated , String original){
        //base case
        if(original.isEmpty()){
            System.out.println(updated);
            return;
        }

        //extracting the character
        char ch  =  original.charAt(0);

        for(int i = 0 ;i <= updated.length() ; i++){
            //creating strings
             String first = updated.substring(0,i);
             String second = updated.substring(i , updated.length());

             //recursive call
            printPermutation(first + ch + second , original.substring(1));
        }
    }


    //returning the list of permutations

    static ArrayList<String> listPermutations(String updated , String original){
        if(original.isEmpty()){
            //creating the list
            ArrayList<String> list = new ArrayList<>();
            list.add(updated);
            return list;
        }


        //creating list of list
        ArrayList<String> ans = new ArrayList<>();
        //extracting the character
        char ch  =  original.charAt(0);

        for(int i = 0 ;i <= updated.length() ; i++){
            //creating strings
            String first = updated.substring(0,i);
            String second = updated.substring(i , updated.length());

            //recursive call and adding all the lists from next calls to it
            ans.addAll( listPermutations(first + ch + second , original.substring(1)));
        }
        //returning the answer list final
        return ans;
    }
}
