package com.DSAWithJava.Lecture10;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> duplicateContainer = findDuplicates(nums);

        for(int item : duplicateContainer){
            System.out.print(item + " ");
        }
    }

    static  List<Integer> findDuplicates(int[]arr){
        //sorting array via cyclic sort
        int i = 0 ;
        List<Integer> ans = new ArrayList<Integer>();
        while( i < arr.length){
            //finding the correct index
            int correctIndex = arr[i] -1;

            if(arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex);
            }else{
                i++;
            }
        }
        //adding check
        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index] != index +1){
                ans.add(arr[index]);
            }
        }

        return ans ;
    }

    // the swap function
    static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
