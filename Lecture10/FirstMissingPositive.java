package com.DSAWithJava.Lecture10;

public class FirstMissingPositive {
//    we have to returne the smallest missing positive
    public static void main(String[] args) {
//        int[] nums = {3,4,-1,1};      //ans is 2;
//        int[] nums = {1,2,0};       ///ans : 3
        int[] nums = {7,8,9,11,12};       ///ans : 1
        int ans = findFirstMissingPositive(nums);
        System.out.println("The first missing positive is : "  + ans);
    }

    static  int findFirstMissingPositive(int[] arr){
        //applying cyclic sort
        int i  = 0 ;

        while(i < arr.length){
            //finding the correct index
            int correctIndex = arr[i] -1;
            //ignoring all -ves and nmbers than greater than n
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(arr ,i , correctIndex);
            }
            else{
                i++;
            }
        }
        //adding checks
        for(int index = 0 ; index < arr.length ; index ++ ){
            if(arr[index] != index+1){
                return  index+1;
            }
        }
        return arr.length+1;    // if  not found the missing index then the last number is to be missing which is n+1;
    }
    static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
