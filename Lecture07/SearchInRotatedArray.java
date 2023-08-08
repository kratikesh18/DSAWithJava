package com.DSAWithJava.Lecture07;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr ={10,12,2,4,5,7,8,9};
        int target = 4;

        System.out.println(search(arr, target));
    }
    static  int search(int[] arr , int target){
        //finding the pivot index
        int pivotIndex = findPivot(arr);

        if(pivotIndex == -1){
            //no roatation found normal binary search
            return binarySearch(arr, target , 0 , arr.length-1);
        }

        if(arr[pivotIndex] == target){
            return  pivotIndex;
        }

        if(arr[0] <= target){
            return  binarySearch(arr, target , 0, pivotIndex-1);
        }
        return binarySearch(arr, target, pivotIndex+1, arr.length-1);

    }
    static  int findPivot(int[]  arr){
        int start = 0 ;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;
            // KEEP MID  IN  THE RANGES
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid ;
            }else if (mid > start && arr[mid] < arr[mid -1]){
                //if the mid  is smalller than the previous element then the previous element is  the pivot
                return mid -1;
            }

            //now the skipping condition
            if(arr[mid] <= arr[start]){
                //we are in hte second part of the order cut the space from end
                end  = mid -1;
            }else if(arr[mid] >= arr[start]){
                //we are in the same space so we need of find in next part
                start = mid +1;
            }
        }
        return -1;      //when no pivot is found
    }

    static int binarySearch(int[] arr ,int target , int start , int end){
        //initialising the start and end
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
}
