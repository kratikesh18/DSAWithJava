package com.DSAWithJava.Lecture04.Questions;

public class MaximumInArray {
    public static void main(String[] args) {
        int[] arr = {2,4 ,15 ,6 ,32 ,8};

        System.out.println("The maximum number in array is: " + maxNum(arr));
    }

    static int maxNum(int[] arr) {
        //edge cases if array is emtpy
        if(arr.length ==0 ){
            return -1 ;
        }

        int maxi = arr[0];

        for(int i = 1 ;i<arr.length; i++){
            if(arr[i] > maxi ){
                maxi = arr[i];
            }
        }

        return maxi;
    }
}
