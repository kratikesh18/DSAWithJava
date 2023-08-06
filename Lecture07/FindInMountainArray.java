package com.DSAWithJava.Lecture07;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = findElement(arr, target);
        System.out.println("ans is : " + ans);
    }
    static  int findElement(int[] arr , int target){
        //step 1 : we have to find the peak element to find the ranges of monotic order in bitonic way
        int peakIndex= findPeak(arr);


        //setting up start and end pointer for acending order
        int start= 0 ;
        int end= peakIndex;
        int ans = orderAgnosticBS(arr, target , start , end );
        if(ans != -1){
            return ans;
        }
        return  orderAgnosticBS(arr, target , peakIndex +1 , arr.length-1);
    }

    static  int findPeak(int[] arr ){
        int start= 0 ;
        int end = arr.length-1;

        while (start < end){
            //finding the  mid
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]){
                //that means we are in the ascending order
                start = mid+1;
            }else{
                //that means we are in the descending order
                end = mid;
            }
        }
        return  start;      //we can return whatever we want start or end;
    }
    static int orderAgnosticBS(int[] arr ,int target , int start ,int end){
        //finding the order of the array
        boolean isAcending = arr[start] < arr[end];

        //normal bs logic
        while(start <= end){
            //finding the mid
            int mid = start + (end - start)/2;

            //if ans find return index
             if(target == arr[mid]){
                 return  mid;
             }
             if(isAcending){
                 if(target < arr[mid]){
                     end = mid -1;
                 }else{
                     start = mid  +1;
                 }
             }
            else{
                if(target <arr[mid]){
                    start  = mid +1;
                }
                else{
                    end = mid -1;
                }
             }
        }
        return  -1;
    }
}

