package com.DSAWithJava.Lecture05.QuestionsOnLinearSearch;

public class MinMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {12,354,13,45},
                {24,2,6,},
                {5,23,63,-75,66}
        };

        System.out.println("The minimum element in array is : " + miniIn2d(arr));
        System.out.println("The maximum element in array is : " + maxiIn2d(arr));

    }

     static int miniIn2d(int[][] arr) {
        int mini = Integer.MAX_VALUE;

        if(arr.length == 0 ){
            return mini;
        }

        for(int i = 0 ;i<arr.length ; i++){
            for(int j  = 0 ; j<arr[i].length ; j++){
                if(arr[i][j] < mini){
                    mini = arr[i][j];
                }
            }
        }
        return  mini;
    }
    static int maxiIn2d(int[][] arr){
        int maxi  = Integer.MIN_VALUE;
        if(arr.length == 0 ){
            return  maxi;
        }

        for(int i = 0 ;i<arr.length ; i++){
            for(int j  = 0 ;j<arr[i].length ; j++){
                if(arr[i][j] > maxi){
                    maxi = arr[i][j];
                }
            }
        }
        return maxi;
    }
}
