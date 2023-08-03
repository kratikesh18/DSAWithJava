package com.DSAWithJava.Lecture04;

import java.util.ArrayList;
import java.util.Scanner;

public class MultidimentionalArrayListsInJava {
    public static void main(String[] args) {
        //Declaring the 2d arrays with ArrayList
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        //we have to initialise the array //with rows
        for(int i = 0 ;i <3 ;i ++){
            arr.add(new ArrayList<>());
        }

        //taking inputs in 2d arrays
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i<3 ; i++){
            for(int j =  0 ; j< 3 ; j++){
                arr.get(i).add(input.nextInt());
            }
        }

        System.out.println(arr);
    }

}
