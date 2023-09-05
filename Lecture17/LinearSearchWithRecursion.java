package com.DSAWithJava.Lecture17;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,66,77,88,99,110};
        int target = 66;
        System.out.println(isPresent(arr ,target, 0));

        //scond fundion
        System.out.println(findElement(arr ,target , 0));
        searchMultiple(arr, target , 0);
        System.out.println(list);

        //returning whole ArrayList
        ArrayList<Integer> ans = new ArrayList<>();
         ans = returningArrayList(arr , target , 0 ,ans );
        System.out.println("Printing List " + ans);



        //returning the Arraylist without passing it into function parameters
        ArrayList<Integer> ans2 = returningArrayListWithoutPasing(arr ,target  , 0);
        System.out.println( "Printing answer without passing list into argument" + ans2);
    }

    static boolean isPresent(int[] arr , int target , int index){
        //BaseCase if index got outOfBound
        if(index == arr.length-1){
            //that means whole array traversed and nothing found
            return false;
        }

        //cheking if the element is found  or not
        if(arr[index] == target){
            return true;
        }
        return isPresent(arr,target, index +1 );
    }

    static int findElement(int[] arr , int target , int index){
        if(index == arr.length-1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        return findElement(arr ,target , index +1);
    }


    //Linear search for multiple element occuring
    static ArrayList<Integer> list = new ArrayList<>();
    static  void searchMultiple(int[] arr , int target , int index){
        //base case
        if(index == arr.length -1){

            return ;
        }

        if(arr[index] == target){
            list.add(index);
        }
        searchMultiple(arr, target , index+1);
    }

    static ArrayList<Integer> returningArrayList(int[]arr , int target ,int index ,  ArrayList<Integer> list ){
        if (index == arr.length-1){
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }
        return returningArrayList(arr ,target ,index+1 , list);
    }

    static ArrayList<Integer> returningArrayListWithoutPasing(int[] arr , int target , int index ){
        //creating the new ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        //BaseCase
        if(index == arr.length){
            //cheking if the list is containing anything
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        //creating new arraylist for storing answers from calls
        ArrayList<Integer> belowCalls = returningArrayListWithoutPasing(arr, target, index+1);
        list.addAll(belowCalls);

        return list;
    }
}
