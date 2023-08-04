package com.DSAWithJava.Lecture06;



public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,24,36,48,60,72,84,96,108,120};
        int target = 96;
        int ans = binarySearch(arr,  target);
        System.out.println("the element is present at index : " + ans);

        int[] arr2= {120,108,96,84,72,60,48,36,24,12};
        int target2 = 12;
        int ans2 = binarySearchDes(arr2 , target2);
        System.out.println("the element is present at index : " + ans2);
    }

     static int binarySearch(int[] arr, int target) {
        //initialising the start and end
         int start = 0 ;
         int end = arr.length -1;

         while (start <= end){
             //finding the mid
             //this direct value of mid cannot handle by integer thats why we have to optimise the expression see notes for explanation
             //int mid = (start + end )/2  ;
             int mid = start  + (end-start)/2;

             if(target < arr[mid]){
                 //that means target is smaller we have to find it on left side
                end = mid-1;
             }else if(target  > arr[mid]){
                 //that means target is greater we have to find it on right side
                 start = mid+ 1;
             }else{
                 //that means we have reach the worst case and the element is found
                 return  mid ;
             }
         }
         //that means we don't found the element
         return  -1;
    }

    //binary search for array sorted by desending order
    static int binarySearchDes(int[] arr , int target){
        int start = 0 ;
        int end =  arr.length -1;

        while (start <=end ){
            int mid = start + (end - start )/2;
            if(target < arr[mid]){
                start = mid + 1;
            }else if(target > arr[mid]){
                end = mid -1;
            }
            else{
                return  mid ;
            }
        }
        return -1;
    }
}

