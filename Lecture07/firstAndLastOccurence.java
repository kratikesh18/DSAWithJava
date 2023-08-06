package com.DSAWithJava.Lecture07;
import java.util.Arrays;

public class firstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        int[] ans = findOccurences(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findOccurences(int[] arr , int target){
        int[] ans  = {-1 , -1};
//
//        ans[0] = firstOccurence(arr, target);
//        ans[1] = lastOccurence(arr, target);

        ans[0] = findOcc1(arr, target , true);
        if(ans[0] != -1){
        ans[1] = findOcc1(arr , target , false);

        }

        return  ans;
    }

    //we can found  in one function
    static  int findOcc1(int[] nums , int target , boolean findFirstOccurence){
        //taking ans and start and end pointer
        int answer = -1 ;
        int start = 0 ;
        int end = nums.length-1;

        while (start <= end){
            //finding the mid
            int mid = start  + (end - start )/2;

            if(target < nums[mid]){
                end = mid -1;
            }else if (target > nums[mid]){
                start = mid +1 ;
            }else{
                //potential answer is found  so store the ans
                answer = mid ;
                //then cheeck if to find the first or last occurence
                if(findFirstOccurence){
                    //so we have to find it on the left hand side  of array
                    end = mid -1;
                }
                else {
                    //we have to find last occurence so we have to find it on right hand side
                    start = mid +1;
                }

            }
        }
        //at the end we have to return the index which is stored in answer
        return  answer ;

    }
    static int firstOccurence(int[] arr , int target){
        int start = 0 ;
        int end = arr.length -1;
        int ans = -1;

        while (start <= end ){
            //finding the mid
            int mid = start + (end - start)/2;
            if(target == arr[mid ]){
                //this can be possible ans
                ans = mid ;
                end = mid-1;
            }
            if(target < arr[mid]){
                end = mid -1;
            }
            if(target > arr[mid]){
                start = mid +1;
            }
        }
        return ans ;
    }
    static int lastOccurence(int[] arr , int target){
        int start = 0 ;
        int end = arr.length -1;
        int ans = -1;

        while (start <= end ){
            //finding the mid
            int mid = start + (end - start)/2;
            if(target == arr[mid ]){
                //this can be possible ans
                ans = mid ;
                start= mid + 1;
            }
            if(target < arr[mid]){
                end = mid -1;
            }
            if(target > arr[mid]){
                start = mid +1;
            }
        }
        return ans ;
    }
}
