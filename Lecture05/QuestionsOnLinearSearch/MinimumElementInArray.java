package com.DSAWithJava.Lecture05.QuestionsOnLinearSearch;

public class MinimumElementInArray {
    public static void main(String[] args) {
        int arr[] = {23 ,34,6,3,13 ,33,4,22,12};
//        int arr[] = {};
        int ans = minimumInArray(arr);
        System.out.println(ans);
    }

     static int minimumInArray(int[] arr) {
        int mini = Integer.MAX_VALUE;
        if(arr.length == 0){
            System.out.print("Array have zero elements returning ");
            return  -1;
        }

        for(int i = 0 ;i<arr.length ; i++){
            if(arr[i] < mini){
                mini= arr[i];
            }
        }
        return mini;
    }
}
