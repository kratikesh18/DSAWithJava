package com.DSAWithJava.Lecture09;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {5,3,4,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertion(int[] arr){
        //first loop will run till n-2;
        for(int i = 0 ; i < arr.length-1; i ++){
            //the second loop will always be i+1 till the 0 which is rerversing
            for(int j = i+1 ; j > 0 ; j--){
                //if the previous element is greater than current then swap
                if(arr[j] < arr[j-1]){
                    swap(arr, j , j-1);
                }else{
                    break;
                }
            }
        }
    }

    static  void swap(int[] arr , int item1 , int item2){
        int temp = arr[item1];
        arr[item1] = arr[item2];
        arr[item2] = temp;
    }
}
