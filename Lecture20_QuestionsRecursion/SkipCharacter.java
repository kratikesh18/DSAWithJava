package com.DSAWithJava.Lecture20_QuestionsRecursion;

public class SkipCharacter {
    public static void main(String[] args) {


        modifyString("" ,"baacdacb" );
        System.out.println(moidifyStringWitoutArgs("abab"));

        System.out.println(skipWholeString("ummiLoveBSCB.tech"));

    }
    static void modifyString(String ans , String original  ){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = original.charAt(0);
        if(ch == 'a'){
            //then not pick
            modifyString(ans , original.substring(1) );
        }else{
            //pciking
            modifyString(ans + ch , original.substring(1));
        }

    }

    static String moidifyStringWitoutArgs(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);
        if(ch == 'a'){
            return moidifyStringWitoutArgs(str.substring(1));
        }else{
            return ch + moidifyStringWitoutArgs(str.substring(1));
        }
    }

    //skipping a whole string
    static String skipWholeString(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("BSC")){
            return skipWholeString(str.substring(3));
        }else{
            return str.charAt(0) + skipWholeString(str.substring(1));
        }
    }



}
