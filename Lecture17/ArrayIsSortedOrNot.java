package com.DSAWithJava.Lecture17;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {2,3,7,8,9};
        System.out.println(isArraySortedRecursively(arr , 0));
    }

    //solving iteratively
    //TimeComplexity O(n) AuxilarySpace O(1)
    static boolean isArraySorted(int[] arr){
        for(int i = 0 ;i < arr.length -1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    //solving recursively
    static  boolean isArraySortedRecursively(int[] arr ,int i){
        //Base Condition    checking if the i is in range or not
        if(i == arr.length -1 ) {
            return true;
        }
        //checking if ith and i+1th element and recursive call for i+1 index with array
        return arr[i] < arr[i+1] &&  isArraySortedRecursively(arr , i+1);
    }


}
