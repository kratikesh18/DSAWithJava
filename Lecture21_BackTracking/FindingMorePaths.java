package com.DSAWithJava.Lecture21_BackTracking;

public class FindingMorePaths {
    public static void main(String[] args){
        printPaths3ways(3,3,"");
        System.out.println(countWays3directions(3,3));
    }


    //counting  how many ways present
    static int countWays3directions(int rows ,int cols ){
        if(rows == 1 || cols == 1){
            return 1;
        }


            int ans1=  countWays3directions(rows -1 , cols );

            int ans2 = countWays3directions(rows , cols -1);

            int ans3 = countWays3directions(rows-1 , cols -1);

            return ans1 + ans2 + ans3;

    }

    //Printing the Paths diagonally with down and right
    static void printPaths3ways(int rows , int cols , String processed){
        if(rows == 1 && cols == 1){
            System.out.println(processed);
            return;
        }

        // here the three calls go for the 3 directions
        if(rows > 1){
            printPaths3ways(rows -1 , cols , processed + "D");
        }
        //now diagonally
        if(rows > 1  &&  cols > 1){
            printPaths3ways(rows -1 , cols -1  , processed + 'd');
        }
        //now right
        if(cols > 1 ){
            printPaths3ways(rows , cols -1 , processed + "R");
        }
    }


}
