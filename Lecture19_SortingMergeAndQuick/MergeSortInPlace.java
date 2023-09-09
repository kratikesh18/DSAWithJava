package com.DSAWithJava.Lecture19_SortingMergeAndQuick;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        inPlaceMergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void inPlaceMergeSort(int[] arr , int st, int end){
        //BAseCase the Array size will be 1 wheb e - s == 1 that's when return
        if(end - st == 1){
            return;
        }
        //finding mid
        int mid = (st+ end) / 2;

         inPlaceMergeSort(arr , st , mid);
         inPlaceMergeSort(arr, mid , end);

         mergeInPlace(arr, st , mid , end);
    }

    static void mergeInPlace(int[] arr , int start  , int mid , int end){
        //creating answer array to store the answer temporarily of length end - start
        int[] ans = new int[end - start];

        //taking indexes accordingly
        int i = start;
        int j = mid;
        int k = 0;

        //checking the ranges of indexes
        while (i < mid  && j < end ){
            if(arr[i] < arr[j]){
                ans[k] =  arr[i];
                i++;
            }else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        //checking if any of index are greater or not
        while(i < mid){
            ans[k] = arr[i];
            i++;
            k++;
        }
        while(j < end){
            ans[k] = arr[j];
            j++;
            k++;
        }

        //copying whole answer data in main array
        for(int index = 0 ; index < ans.length ; index++){
            arr[start + index] = ans[index];        //DRY Run here ...1
        }

    }
}
