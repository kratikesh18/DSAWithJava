package com.DSAWithJava.Lecture07;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr ={3,4,5,6,7,0,1,2};
//            int[] arr = {1,2,3,4,5,6,7};
        System.out.println(findPivot(arr));

        int[] arr2 = {2,9,2,2,2,2};
        System.out.println(findPivotWithDuplicateElements(arr2));
    }
    static  int findPivot(int[] arr){
        int  start = 0 ;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start )/2;
                //keep  int the mind  the mid is  in the  ranges

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }else if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            //now skipping conditions
            if(arr[mid] >= arr[start]){
                //which means we are at the same side of order we pivot found in next
                start = mid+1;
            }else if(arr[mid] <= arr[start]){
                //we are in the second  part of the order we have to come back
                end = mid -1;
            }
        }
        return -1  ;     //because no pivot if found
    }
    static  int findPivotWithDuplicateElements(int[] arr){
        int  start = 0 ;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start )/2;
            //keep  int the mind  the mid is  in the  ranges

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }else if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            // check for duplicates if found then skip them
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //check if the skipping element is a pivot or not
                if(arr[start] > arr[start +1]){
                    return  start ;
                }//if not then skipp the element
                start++;

                //same for end
                if(arr[end] < arr[end-1]){
                    return end -1;
                }
                end --;
            }

            //left side is sorted then pivot is in the right dside
            if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1  ;     //because no pivot if found
    }



}
