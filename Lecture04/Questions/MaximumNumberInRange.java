package com.DSAWithJava.Lecture04.Questions;

public class MaximumNumberInRange {
    public static void main(String[] args) {
        int arr[] = {7,345, 54 ,23 , 90 , 3, 11 };
        int ans  = maxiInRange(arr  , 2, 5);
        System.out.println("the maximum number in Range is : " + ans );
    }
    static  int maxiInRange(int[]arr , int index1 , int index2 ){
        //some edge cases
        if(index1 > index2){
            return -1;
        }
        if(arr == null){
            return -1 ;
        }
        int maxi = arr[index1];

        for(int i   = index1 ; i <=  index2 ; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }

}
