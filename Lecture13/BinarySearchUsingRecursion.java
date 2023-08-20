package com.DSAWithJava.Lecture13;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr ={12,24,36,48,60,72,84,96,108,120};
        int target = 1;

        int ans =   BSRecursion(arr , target , 0 , arr.length-1);
        System.out.println(ans);
    }

    static int BSRecursion(int[]arr , int target ,int start , int end){
        //finding mid
        int mid = start + (end - start)/2;

        //another base requred
        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] < target){
            return BSRecursion(arr ,target , mid+1 , end);
        }
        else if (arr[mid] >= target){
           return BSRecursion(arr,  target, start , mid-1);
        }

        return -1;

    }
}
