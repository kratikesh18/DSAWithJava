package com.DSAWithJava.Lecture01;

public class Basics {
    public static void main(String[] args) {
        if(true){
            System.out.println("Printing because the condition is true");
        }

        //performing while lop
        int count = 1;
        while (count<=10){
            System.out.println(count);
            count++ ;   //dont forget to increament the value
        }

        //performing the for loop
        for(char  ch = 'a' ; ch <= 'k' ; ch++ ){
            System.out.println(ch);
        }

    }
}
