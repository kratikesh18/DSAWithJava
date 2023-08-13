package com.DSAWithJava.Lecture09;

import java.util.Arrays;

public class BubbleSortOptimised {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};    //for already sorted
        System.out.println(Arrays.toString(arr));
        bubbleSortOptimised(arr);
        System.out.println(Arrays.toString(arr));
    }

    //the optimised bubble sort
    static  void bubbleSortOptimised(int[] arr){
        //passed loop running for n-1 times
        for(int i = 0 ;i<arr.length-1 ; i++){
            // taking boolean flag for optimisation
            boolean isSwapped  = false;

            //the innner loop is for comparing and swapping
            for(int j = 1 ; j< arr.length-i ; j ++){
                if(arr[j] < arr[j-1]){
                    //swapping logic
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]  = temp;
                    //marking swap true because sapping is happend
                    isSwapped = true;
                }
            }
            //brekaing the loop if no swapping occuerd in pass
            if(!isSwapped){
                break;
            }
        }
    }
}
