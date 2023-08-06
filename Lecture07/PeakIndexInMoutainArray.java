package com.DSAWithJava.Lecture07;

public class PeakIndexInMoutainArray {
    public static void main(String[] args) {
//        int[] arr ={1,2,3,1};           //expected answer is 3;
//        int[] arr = {0,2,1,0};          //expected answe is 2
        int[] arr = {0,10,5,2};          //expected answe is 10

        int ans  = findPeakElement(arr);
        System.out.println(ans);
    }
    static  int findPeakElement(int[]arr ){
        int start= 0 ;
        int end = arr.length -1;

        while (start  < end){
            int mid  = start + (end - start)/2;

            if(arr[mid] < arr[mid+1]){
                //that means we are in the ascending part of the array
                //that means peak index is in the right part
                start = mid +1;
            }else{
                //we are in the descending part so the peak can be in left part
                end = mid ;     //if we did mid -1 we aren't reaching the break condition start = end thats why
            }
        }
        //we are out of the loop that means start and end are pointing towards the same element which is the peak element
        return  arr[start]; //you can return end also because they both are pointing to the same element
    }
}
