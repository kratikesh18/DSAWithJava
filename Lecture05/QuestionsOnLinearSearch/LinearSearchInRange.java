package com.DSAWithJava.Lecture05.QuestionsOnLinearSearch;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int arr[] = {12, 34 ,11,5,2,66,74,8,92};
        int target = 5;
        isPresent(arr, target , 3, 8);

    }

     static void isPresent(int[] arr, int target, int strt, int end) {
        if(arr.length == 0){
            System.out.println("Array have zero elements ");
            return;
        }

        for(int i = strt ; i<=end ; i ++){
            if(arr[i] == target){
                System.out.println(target + " found at index " + i);
                return;
            }
        }
         System.out.println("element not present .");
    }
}
