package com.DSAWithJava.Lecture03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class functionsWithArray {
    public static void main(String[] args) {
        int[] arr = {34 ,1,3,4,6,7,8};
        changeAray(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void changeAray(int[] arr){
        arr[0] = 99;
    }
}
