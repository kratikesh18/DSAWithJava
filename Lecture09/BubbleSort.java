package com.DSAWithJava.Lecture09;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 4, 2};
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.print("The sorted array at follows : ");
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleSort(int[] arr){
        //outer loop for passes
        for(int i = 0 ;i<arr.length-1;i++){
            //inner loop for comparisions
            for(int j = 0 ;j<arr.length-i-1; j++){
                //swapping if only the forward element is greater than the current one
                if(arr[j] > arr[j+1]){
                    //swapping logic
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

















