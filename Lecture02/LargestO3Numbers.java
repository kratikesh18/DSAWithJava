package com.DSAWithJava.Lecture02;


import java.util.Scanner;

public class LargestO3Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
/*

        int max = a;
        if(b> max){
            max = b;

        }
        if(c > max){
            max = c;
        }
*/

     /*   int max =0 ;
        if(a > b ){
            max = a;
        }
        else {
            max = b;
        }

        if(c > max){
            max = c;
        }*/

        int max = Math.max(a , Math.max(b,c ));

        System.out.println(max);
    }
}

