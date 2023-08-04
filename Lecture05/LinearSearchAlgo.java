package com.DSAWithJava.Lecture05;


import java.util.Scanner;

public class LinearSearchAlgo {
    public static void main(String[] args) {

        int[] arr = {12 ,24,36,48,60,72,84,96,108,120};
//        int[] arr = {};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target  = input.nextInt();
        linearSearch(arr , target);


        System.out.println("output of sencond function :" + linearSearchIndex(arr, target));

        System.out.println("output of third fucntion : " + linearSearchBoolean(arr, target));
    }

    static boolean linearSearchBoolean(int[] arr, int target) {
        if(arr.length ==0){
            return  false;
        }
        for (int i = 0 ;i<arr.length ; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return  false;
    }

    static  void linearSearch(int[] arr ,int target){
        if(arr.length == 0){
            System.out.println("Array is empty.");
            return;
        }
        for(int i=  0 ;i <arr.length ; i++){
            if(arr[i] == target){
                System.out.println(target + " is present at index " + i);
                return;
            }
        }
        System.out.println("The element is not present in array.");
    }

    //function with returning index only
    static int linearSearchIndex(int[] arr , int target){
        if(arr.length == 0 ){
            return -1;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target) {
                return  i;
            }
        }
        return  -1;
    }
}
