package com.DSAWithJava.Lecture08;

import java.util.Arrays;

public class SearchingIn2DArray {
    public static void main(String[] args){
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        //printing the array
        for(int[] i: arr){
            System.out.println(Arrays.toString(i));
        }

        int target = 43;

        System.out.println("The Target is at Co-ordinates: " + Arrays.toString(searchInMatrix(arr, target)));


    }
    static int[] searchInMatrix(int[][] arr , int target){
        //taking upper bound and lowerBownd
        int lowerBound = 0;
        int upperBound = arr.length -1;

        //iterating within the range
        while(lowerBound < arr.length && upperBound >= 0 ){
            if(arr[lowerBound][upperBound] == target){
                return new int[]{lowerBound,upperBound};
            }

            //if the target is smaller than upperbound then we have ingore that whole column
            if (target < arr[lowerBound][upperBound]){
                upperBound --;
            }
            else {
                lowerBound++;
            }
        }
        return new int[]{-1,-1};
    }
}
