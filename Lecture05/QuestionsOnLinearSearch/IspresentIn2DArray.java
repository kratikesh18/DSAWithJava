package com.DSAWithJava.Lecture05.QuestionsOnLinearSearch;

import java.util.Scanner;

public class IspresentIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {12,354,1,45},
                {24,2,6,},
                {5,23,63,75,66}
        };

        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        linearSearchIn2D(arr, target);
    }

     static void linearSearchIn2D(int[][] arr , int target) {
        if(arr.length == 0 ){
            return;
        }

        for(int i  = 0 ;i<arr.length ; i++){
            for(int j = 0 ;j <arr[i].length ; j++){
                if(arr[i][j] == target){
                    System.out.println(target + "is present at index " + i +"," + j);
                    return;
                }
            }
        }
    }


}
