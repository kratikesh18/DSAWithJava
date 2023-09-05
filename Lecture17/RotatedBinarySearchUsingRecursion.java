package com.DSAWithJava.Lecture17;

public class RotatedBinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        int target =1 ;
        System.out.println(rotatedBS(arr, target ,0 , arr.length-1));
    }

    static  int rotatedBS(int[] arr , int target , int start , int end ){

        //base case
        if(start > end){
            return -1;
        }
        //finding the mid
        int mid =  start  + ( end - start)/2;
        if(arr[mid]  == target ){
            return  mid;
        }

        //cheking if the array from start till mid is sotred or not
        if(arr[start]  <= arr[mid]){
            //if sorted then check if target is in range or not
            if( target >= arr[start] && target <= arr[mid]){
                //if is in range then  decrease the range mid -1
                    return rotatedBS(arr , target , start , mid -1);
            }else {
                //we have to find it on next part of the array
                    return  rotatedBS(arr ,target , mid +1 , end);
            }
        }

        //if the start and mid is not sorted then check the key is in range from mid and end
        if(target >= arr[mid] && target <= arr[end){
            return rotatedBS(arr, target , mid +1  , end);
        }


        return rotatedBS(arr , target , start , mid -1);
    }
}
