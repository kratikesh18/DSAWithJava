package com.DSAWithJava.Lecture21_BackTracking.Backtracking_Questions;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TheNQueensProblem {
    public static void main(String[] args){
        int n = 4;
        boolean[][] board = new boolean[n][n];

        System.out.println(nQueens(board , 0));
        System.out.println(nQueens2(board, 0));
    }

    static int nQueens(boolean[][] board , int row){
        //writing base case
        if(row == board.length){
            showAnswer(board);
            System.out.println();
            return 1;
        }
        //counting how many ways are there
        int count = 0 ;


        for(int col = 0 ; col < board.length; col ++){
            //cheking the co-ordinates via isSafe
           if( ifSafe(board , row , col)){
                //if safe then place the queen by marking it true
                board[row][col] = true;
                //calling the recursion to handle the rest
                count = count + nQueens(board, row+1);
                //restoring the position of the board as it was by backtracking
                board[row][col] = false;
            }
        }
        return count;
    }

    static boolean ifSafe(boolean[][] board, int row, int col){
        //checking for the vertical direction
        for(int i =0 ; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }

        //cheking for diagonal left
        int diagonalLeft = Math.min(row, col);
        for(int i = 1; i <= diagonalLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        //cheking for diagonal right
        int diagonalRight = Math.min(row, board.length - col -1 );
        for(int i = 1; i <= diagonalRight ; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }


    static void showAnswer(boolean[][] board ){
        for(boolean[] row : board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
    static List<String> showList(boolean[][] board ){
        List<String> ans = new ArrayList<>();
        for(boolean[] row : board){
            String answers = "";
            for(boolean element: row){
                if(element){
                    answers += "Q";
                }
                else{
                    answers += '.';
                }
            }
            ans.add(answers);
        }

        return ans;
    }

    static List<List<String>> nQueens2(boolean[][] board , int row){
        //writing base case
        if(row == board.length){
//            showAnswer(board);
//            System.out.println();
            List<List<String>> ans = new ArrayList<>();
            ans.add(showList(board));
            return ans;
        }
        //counting how many ways are there
//        int count = 0 ;
        List<List<String>> count = new ArrayList<>();

        for(int col = 0 ; col < board.length; col ++){
            //cheking the co-ordinates via isSafe
            if( ifSafe(board , row , col)){
                //if safe then place the queen by marking it true
                board[row][col] = true;
                //calling the recursion to handle the rest
                count.addAll( nQueens2(board, row+1));
                //restoring the position of the board as it was by backtracking
                board[row][col] = false;
            }
        }
        return count;
    }

}
