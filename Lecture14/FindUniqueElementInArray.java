package com.DSAWithJava.Lecture14;

public class FindUniqueElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(findUnique(arr));
        System.out.println(2^3);
    }

    static int findUnique(int[] arr ){
        int unique = 0 ;

        for(int i : arr){
            unique = unique ^ i;
        }
        return unique;
    }
}
