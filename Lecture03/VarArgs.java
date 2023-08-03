package com.DSAWithJava.Lecture03;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        funVarArgs(3,56,63,24,6);

        funVarArgs("Kartikesh" , "Pachkawade " , "Weds" , "Pratiksha" , "Malewar");

        varArgsWithMultipleArgs( 2 ,5 , "loda" , "lassan");
    }
    static  void varArgsWithMultipleArgs(int a , int b , String ...v){
        System.out.println(a + b  + " " + Arrays.toString(v));

    }
    static  void funVarArgs(int ...v){  //this will going to take the input in array format
        System.out.println(Arrays.toString(v));
    }
    static  void funVarArgs(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
