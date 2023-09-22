package com.DSAWithJava.Lecture21_BackTracking;

public class TheMaxeWithObstacle {
    public static void main(String[] args){
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        printWays(maze , 0 , 0 , "");
    }

    static void printWays(boolean[][] maze , int rows , int cols , String processed){
        if(rows == maze.length -1  &&  cols == maze[0].length-1){
            System.out.println(processed);
            return;
        }
        if(!maze[rows][cols]){
            return;
        }
        if(rows < maze.length -1 ){
            printWays(maze , rows +1, cols , processed  + "D");
        }
        if(cols < maze[0].length -1){
            printWays(maze , rows , cols +1  , processed + "R");
        }
    }
}
