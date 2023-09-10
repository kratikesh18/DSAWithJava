package com.DSAWithJava.Lecture19_SortingMergeAndQuick;

import java.util.Arrays;

public class TheQuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    // void function because Quicksort is inplace sorting algorithm
    static void quickSort(int[] arr , int low , int high){
        //when those pointers will violets the condition
        if(low >= high){
            return;
        }

        //initializing start and end
        int st = low;
        int end = high;
        //finding pivot element
        int mid =  st + (end - st) /2;
        int pivotElement = arr[mid];

        //start and end is for checking and swapping
        while(st <= end){
            //if  violation not found
            while(arr[st] < pivotElement){
                st++;
            }
            while(arr[end] > pivotElement){
                end--;
            }


            //one step to swap the last and  starting  point
            if(st <= end){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }

        }

        //recursive calls
        quickSort(arr, low, end);
        quickSort(arr, st , high);
    }
}

/* COMPLEXITY ANALYSIS
    TIME COMPLEXITY
    BEST CASE = O(nlogn)
    WORST CASE = O(n^2)

    SPACE COMPLEXITY
    O(nlogn)

 */