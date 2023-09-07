package com.DSAWithJava.Lecture19_SortingMergeAndQuick;

import java.util.Arrays;

public class TheMergeSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        //merge sort is returning the Array so we have to store it or directly print
        System.out.println(Arrays.toString( mergeSort(arr)));

    }

    //TheMergeSort Function
    static int[] mergeSort(int[] arr){
        //BaseCase : if the array length is 1 return the array because only element is already sorted
        if(arr.length == 1){
            return arr;
        }

        //Dividing Array to the 2 parts by finding mid
        int mid = arr.length/2;

        //now we can divide the arrays into two parts
        int[] leftArray = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] rightArray = mergeSort(Arrays.copyOfRange(arr ,mid ,arr.length));

        //Now we have both parts in Sorted form we just hwve to merge them
        return mergeSortedArrays(leftArray , rightArray);
    }

    static int[] mergeSortedArrays(int[] first , int[] second){
        //To store the Answer, have to create the answer arrays of size sum of first and second's size
        int[] ans = new int[first.length + second.length];

        //taking indexes respectively for first, second and answer array
        int i = 0;
        int j = 0;
        int k = 0;

        //checking the ranges of the indexes accordingly and putting them into the answer array
        while (i < first.length && j < second.length){
                //Comparing the elements
                if(first[i] < second[j]){
                    ans[k] = first[i];
                    i++;
                }else{
                    ans[k] = second[j];
                    j++;
                }
                //after each pass we have to increment kth index
            k++;
        }

        //checking if any of array is left
        while(i < first.length){
            ans[k] = first[i];
            i++ ;
            k++;

        }

        // same condition for second array
        while(j < second.length){
            ans[k] = second[j];
            j++;
            k++;
        }

        return ans;


    }

}
