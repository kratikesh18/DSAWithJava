package com.DSAWithJava.Lecture04.Questions;

import java.util.Arrays;

public class SwapArrayIndexes {
    public static void main(String[] args) {
//        here we are swapping the indexes

        int[] arr = {12 ,24 ,36, 48, 60, 82};
        System.out.println(Arrays.toString(arr));
        swap(arr ,2 , 4);
        System.out.println(Arrays.toString(arr));

    }

    static  void swap(int[] arr , int index1 , int index2){
        //swapping logic
        int temp = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = temp;
    }
}
