package com.DSAWithJava.Lecture06;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {12,24,36,48,60,72,84,96,108,120};
        int[] arr = {120,108,96,84,72,60,48,36,24,12};
        int target = 96;
        int ans = orderAgnosticBinarySearch(arr,target);
        System.out.println("the element is present at index: " + ans);

    }

    static int orderAgnosticBinarySearch(int[] arr ,int target ){
        int start = 0 ;
        int end = arr.length -1;

        boolean  asc = arr[start] < arr[end];

        while (start <= end){

            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return  mid ;
            }

            if(asc){
                //that means normal binary search
                if(target < arr[mid]){
                    end = mid -1;
                }
                else{
                    start  = mid +1;
                }
            }
            else{
                if(target > arr[mid]){
                    end  = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return  -1;

    }
}
