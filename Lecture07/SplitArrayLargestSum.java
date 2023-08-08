package com.DSAWithJava.Lecture07;

public class SplitArrayLargestSum {
    public static void  main (String[] args){
        int[] arr ={7,2,5,8, 10};
        int k = 2;
        System.out.println(splitArray(arr , k ));
    }

   static int splitArray(int[] nums, int k) {
       //taking initially start and end 0 // we have to solve it via range
       int start =0 ;
       int end = 0;

       //finding the max and min value that can be answer of question
       for(int i = 0 ; i <nums.length; i++){
           start = Math.max(start , nums[i]);      // start will be maximum element of the array

           end = end + nums[i];           //end will be sum of all  elements in the array
       }

       //now we have the range so binaary search
       while (start < end ){
           //finding the mid
           int mid = start + (end - start )/2;

           //calculating the pieces
           int pieces = 1;
           int sum = 0 ;

           //iterating over all elements in array
           for(int num : nums){
               if(sum + num > mid ){
                   //we cannot add this into the piece of the array // we have to make a new one
                   sum = num;
                   pieces ++;
               }
               else {
                   //we can add this into the array
                   sum  = sum+  num;
           }
       }

           //now cheking the limitaions
           if(pieces <= k){
               //then we have to minimize the range to the mid
               end = mid;
           }else{
               start = mid +1 ;
           }
        }
                return  start ; // start == end
        }

   
}