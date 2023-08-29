package com.DSAWithJava.Lecture14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FliipingAnImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        for(int[] i : image){
            System.out.println(Arrays.toString(i));
        }

        image = flipAndInvertImage(image);
        System.out.println("Printing ans ");
        for(int[] i : image){
            System.out.println(Arrays.toString(i));
        }
    }
    public static  int[][] flipAndInvertImage(int[][] image) {
        //taking the each array in 2D array
        for(int[] i : image){
            //reversing that array
            for(int j=0 ;j <(image[0].length +1)/2 ; j++){
                //swapping
                int temp = i[j] ^1;
                i[j] =  i[image[0].length- j- 1] ^1;
                i[image[0].length-j-1] = temp;
            }
        }
        return image;
    }
}
