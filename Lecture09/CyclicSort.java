package com.DSAWithJava.Lecture09;


import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args){
//      int[] arr = {3,5,2,1,4};
//        int[] arr = {5,4,3,2,1};
        //duplcates in array
        int[] arr = {6,5,4,3,2,3,1,2,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


//    static void cycleSort(int[] arr){
//        int i = 0 ;
//        while(i < arr.length){
//            if(arr[i] == i-1){
//                i ++ ;
//            }else{
//                swap(arr , i , arr[i]);
//            }
//        }
//    }



    static void cycleSort(int[] arr){
        //taking index
        int i  = 0 ;

        //itearing over array till end
        while ( i < arr.length){
            //finding the correct index of ith element
            int correctIndex = arr[i] - 1;

            if(arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            }else{
                i++;
            }


        }
    }
    static  void swap(int[] arr , int item1 , int item2){
        int temp = arr[item1];
        arr[item1] = arr[item2];
        arr[item2] = temp;
    }
}
