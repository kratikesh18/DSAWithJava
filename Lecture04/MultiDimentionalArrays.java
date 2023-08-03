package com.DSAWithJava.Lecture04;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArrays {
    public static void main(String[] args) {

        //declaring multidimentinal array (2D  array)

        //2Dimentioal arrays can be imagined as a matrix
        //here passing row nums are mendatory
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        // arr.length : in 2d array gives number of rows
        //arr[i].length : gives the number of columns which can be unknown
        //printing 2d array
        for(int i = 0 ; i<arr.length ; i++ ){
            for(int j = 0 ; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //creating 2nd 2d array to taking inputs
        int[][] arr2 = new int[3][3];
        //declaring scanner
        Scanner input = new Scanner(System.in);
        //taking input in array
        for(int row = 0 ; row  < arr2.length ; row++ ){
            for(int col = 0 ; col < arr[row].length ; col ++ ){
                System.out.print("Enter element: ");
                arr2[row][col] = input.nextInt();
                System.out.println();

            }
        }

        //printing array with Arrray method
        System.out.println("Printing the 2DArray");
        for(int row = 0 ; row < arr2.length ; row++ ){
            System.out.println(Arrays.toString(arr2[row]));
        }


        //printing the array with for Each loop
        System.out.println("Printing the Array using for Each loop ");
        for(int[] i : arr2){
            System.out.println(Arrays.toString(i));
        }
    }

}
