package com.DSAWithJava.Lecture07;

public class CeilingOfTheNumber {
    public static void main(String[] args) {
        //find ceiling : ceiling is the smallest element which is greater than or equal to target

        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;
        int ans = findCeiling( arr,  target);
        System.out.println(ans);
    }

     static int findCeiling(int[] arr, int target) {
        //taking  start and end two pointers
         int start = 0 ;
         int end = arr.length -1;

         while (start <= end) {
             //finding the mid
             int mid = start + (end - start) / 2;

             if (target < arr[mid]) {
                 //the target element is smaller than the target
                 end = mid - 1;
             } else if (target > arr[mid]) {
                 //target element is greater than middle element
                 start = mid + 1;
             } else {
                 //the target is emements is exactly found
                 return mid;
             }
         }
         //we are exited from loop the (start<=end) condition is violetd that means start is goes ahead  of end which is greater than the target element
         return  arr[start];
    }
}
