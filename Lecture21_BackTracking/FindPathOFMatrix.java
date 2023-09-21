package com.DSAWithJava.Lecture21_BackTracking;

import java.util.ArrayList;
import java.util.List;

public class FindPathOFMatrix {
    public static void main(String[] args){
        System.out.println(returnPaths(3,3));
        printPaths(3,3, "");
        System.out.println(returnPathList(3,3,""));
    }

    static int returnPaths(int rows , int cols ){
        //baseCase if any of argument will became 1 then the 1 path is present
        if(rows  == 1  || cols == 1){
            return 1;
        }

        //the recursive relation
        int down =  returnPaths(rows -1 ,cols );
        int right = returnPaths(rows , cols -1);
        return down + right;
    }

    static void printPaths(int rows , int cols , String processed){
        if(rows == 1 && cols == 1){
            System.out.println(processed);
            return;
        }

        //the two void calls
        //when the rows decrease we go to the down so include D
        //we decresee rows when the rows are greater than 1
        if(rows > 1 ){
        printPaths(rows -1 , cols , processed + "D");

        }
        //we decresee the cols when the cols are greater than 1
        if(cols >1){
            //when the cols decrease we go to the right so include R
            printPaths(rows , cols -1 , processed + "R");

        }
    }

    static List<String> returnPathList(int row , int cols , String processed ){
        if(row == 1 && cols == 1){
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        //creating the list to store the future calls answer
        List<String> paths  = new ArrayList<>();
        //adding all possible paths to the list
        if(row > 1){
            paths.addAll(returnPathList(row -1 , cols , processed + "D"));
        }
        if (cols > 1){
            paths.addAll(returnPathList(row , cols-1 , processed + "R"));
        }

        //returning the paths to the calls
        return paths;
    }


}
