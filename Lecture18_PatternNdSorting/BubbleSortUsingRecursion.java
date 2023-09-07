package com.DSAWithJava.Lecture18_PatternNdSorting;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};

        System.out.println(Arrays.toString(arr));
        bubbleSortRecursive(arr , arr.length-1 , 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortRecursive(int[] arr , int row , int col){
        //BaseCase
        if(row == 0 ){
            return;
        }
        if(col < row){
            //cheking for swapping condition
            if(arr[col] > arr[col+1]){  //ATTENTION TO SIGN HERE
                //swapping logic
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            //recursive call for next column item
            bubbleSortRecursive(arr , row , col+1);
        }else{
            //just a call for next row
            bubbleSortRecursive(arr , row -1, 0);
        }
    }
}
