package com.DSAWithJava.Lecture10;

public class FindDuplicateElementInArray {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};     //there will be the only duplicate in the array
        int ans = findDuplicate(nums);
        System.out.println("The Duplicate number is : " + ans);

    }

    static  int findDuplicate(int[]arr){
        //cyclic sort
        int i = 0 ;
        while (i < arr.length){
            //finding the correct index

            if(arr[i] != i+1){
                int correctIndex = arr[i] -1;

                if(arr[i] != arr[correctIndex]){
                    swap(arr, i , correctIndex);
                }else{
                   return arr[i];
                }
            }else{
                //increasing iteration
                i++;
            }
        }
        return  -1;
    }
    static  void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
