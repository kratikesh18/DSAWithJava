package com.DSAWithJava.Lecture17_PatternNdSorting;

import java.util.Arrays;

public class SelectionSortRecursively {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        selectionSortUsingRecursion(arr, arr.length ,0 ,    0 );
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSortUsingRecursion(int[] arr , int row, int col , int maxIndex){
        if(row == 0){
            return;
        }

        if(col < row){
            if(arr[col] > arr[maxIndex]){
                //this means new max index found so update max , col is new maxIndex
                selectionSortUsingRecursion(arr , row, col+1, col);
            }else{
                //this means no MaxIndex found so recursiveCall for same maxIndex
                selectionSortUsingRecursion(arr , row, col+1, maxIndex);
            }
        }else{
            //this case means 1 pass is completed maxIndex and lastIndex has to be Swwpped
            int temp  = arr[maxIndex];
            arr[maxIndex] = arr[row-1];
            arr[row-1]= temp;
            //then recursive call for decreaseing the pass
            selectionSortUsingRecursion(arr ,row-1, 0 , 0);
        }
    }
}
