package com.DSAWithJava.Lecture09;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
         selSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selSort(int[] arr){
        //a loop for iteration over array
        for(int i = 0 ;i< arr.length; i++){
            //getting last inedex and index of maximum element's index
            int lastIndex = arr.length -i -1;
            int maxIndex = findMaxIndex(arr, 0 , lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static  int findMaxIndex(int[] arr , int start , int end ){
        int maxIndex =start;
        for(int i = start ; i <=end ; i++){
            if(arr[i] > arr[maxIndex]) {
                    maxIndex= i;
            }
        }
        return maxIndex;
    }

    //swapping function for arrays
    static  void swap(int[] arr , int item1 , int item2){
        int tepp = arr[item1];
        arr[item1] = arr[item2];
        arr[item2] = tepp;
    }
}
