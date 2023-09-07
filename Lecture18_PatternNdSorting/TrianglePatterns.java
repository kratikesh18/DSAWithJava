package com.DSAWithJava.Lecture18_PatternNdSorting;

public class TrianglePatterns {
    public static void main(String[] args) {
        System.out.println("Printing first Pattern");
        printTraingle1(4, 0);
        System.out.println("Printing Second Pattern");
        printTraingle2(4 , 0);
    }
    static  void printTraingle1(int row , int col){
        //base Case
        if(row  == 0 ){
            return;
        }

        if(col < row){
            System.out.print(" * ");
            //recutsive call for col +1 ;
            printTraingle1(row , col +1);
        }else{
            //printed the whole row now print a line and call for row -1
            System.out.println();
            printTraingle1(row-1 ,  0);
        }
    }

    //function for printing the inverted of the abuve triangle
    static void printTraingle2(int row  , int col){
        //base case
        if(row == 0 ){
            return;
        }

        if(col < row){
            //call the function till the base case reach
            printTraingle2(row , col+1);
            //then start printing till the cols is smaller than the row
            System.out.print(" * ");
        }else{
            //this means we have printed the row now printing the line and call for the rest of rows
            printTraingle2(row -1 , 0);
            System.out.println();
        }
    }
}
