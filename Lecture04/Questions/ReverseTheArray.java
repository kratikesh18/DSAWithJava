package com.DSAWithJava.Lecture04.Questions;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        //handling edge cases
        if(arr == null){
            return;
        }
        int start = 0;
        int end  = arr.length-1 ;       //this is becasue index starts with 0

        if(start < end ){       //jabtak start end se chhota hain tabtak loop chalega
            swap(arr , start, end);
            start ++  ;
            end --;
        }
    }

    static void swap(int[] arr , int index1 , int index2){
        int temp  = arr[index1];
        arr[index1]= arr[index2];
        arr[index2] = temp;
    }
}
