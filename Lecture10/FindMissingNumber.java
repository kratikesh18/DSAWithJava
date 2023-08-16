package com.DSAWithJava.Lecture10;

public class FindMissingNumber {
    public static void main(String[] args) {
//       int[] nums = {0,4,2,1};  // the missing number si : 3
       int[] nums = {0,3,2,1};  // the missing number si : 3
        System.out.println("the missing number is : "  + findNumber(nums));
    }

    static int findNumber(int[] arr){
        // first apply cyclicsort
        int i = 0 ;
        while( i < arr.length){
            //the correct index is the element istself because array is starting from 0 ;
            int correctIndex = arr[i];

            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            }else{
                //increasing the iteration count
                i++ ;
            }
        }
        //applying check
        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index] != index){
                return  index ;
            }
        }
        return arr.length;      //that mesans the last element in the range is missing
    }

    //the swap function
    static  void  swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


}
