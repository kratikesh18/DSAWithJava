package com.DSAWithJava.Lecture04;

import java.util.Arrays;
import java.util.Scanner;

public class IntroductionToArrays {
    public static void main(String[] args) {
        //collection of same datatype "maybe in contineous mem locations "depends on JVM
        int[] arr = new int[5];     //need to pass the size of the array

        //setting up values manually    //array acessed by indexing and indexing started from 0
        arr[0] = 12;
        arr[1] = 24;
        arr[2] = 36;
        arr[3] = 48;
        arr[4] = 60;

        System.out.print(arr[0]+ " ");
        System.out.print(arr[1]+ " ");
        System.out.print(arr[2]+ " ");
        System.out.print(arr[3]+ " ");
        System.out.println(arr[4]+ " ");

        //taking inputs in array
        //declaring scanner
        int[] arr2 = new int[5];
        System.out.print("Enter array elements : ");
        Scanner input = new Scanner(System.in);
        for(int i = 0 ;i<arr2.length ;i++){
            arr2[i] = input.nextInt();
        }

        //printing the array
        for(int i = 0 ; i<arr2.length ; i++){
            System.out.print(arr2[i] + " ");
        }


        //we can print arrays with for each loop also
        System.out.println("\nPrinting the Array with for each : ");
        for(int i : arr2){
            System.out.print(i + " ");
        }


        //we can print array with Arrays Method

        System.out.println("\nPrinting Array with Array method ");
        System.out.println(Arrays.toString(arr2));
     }


}
