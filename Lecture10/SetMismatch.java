package com.DSAWithJava.Lecture10;


import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
         int[] nums = {2,1,4,2,6,5};
         int[] ans = findSetMismatch(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findSetMismatch(int[] arr){
        //applying cycle  sort
        int i =0 ;
        while (i < arr.length){
            //finding th correct index
            int correctIndex = arr[i] -1;

            if(arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            }else {
                i++;
            }
        }

        //applying checks
        for(int index = 0 ;index < arr.length ; index++){
            if(arr[index] != index+1){
                return  new int[] {arr[index] , index+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
