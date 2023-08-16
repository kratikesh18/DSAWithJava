package com.DSAWithJava.Lecture10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissingNumbersInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findMissingNumbers(nums);

        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }

    static List<Integer> findMissingNumbers(int[] arr){
        List<Integer> ans = new ArrayList<Integer>();

        //applying the cyclic sort
        int i = 0 ;
        while(i < arr.length){
            //finding  the correct index now its  value -1 because array does not contain zero
            int correctIndex = arr[i] - 1;

            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }


        //chekin for the  missing elements
        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans ;
    }

    static  void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
