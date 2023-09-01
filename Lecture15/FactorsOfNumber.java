package com.DSAWithJava.Lecture15;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int n = 30;
        printFactors1(n);
        System.out.println();
        printFactors2(n);
        System.out.println();
        printFactors3(n);
    }
    static void printFactors1(int n ){
        for(int i = 1; i <= n ; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }

    static void printFactors2(int n ){
        //optimising code
        for(int i = 1; i < Math.sqrt(n) ; i++){
            if(n % i == 0 ){
                if(n/i == i) {
                    System.out.println(i + " ");
                }else {

                    System.out.print(i + " " + n/i + " ");

                }
            }
        }
    }

    static  void printFactors3(int n ){
        //creating arrayList to
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;  i <= Math.sqrt(n) ; i++){
            if(n % i == 0 ){
                if(n/i == i) {
                    System.out.println(i + " ");
                }else {

                    System.out.print(i + " ");
                    list.add(n/i);

                }
            }
        }
        //printing the list reversely
        for(int  i = list.size() -1 ; i >= 0 ;i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
