package com.DSAWithJava.Lecture21_BackTracking;

import java.util.Arrays;

public class FourDirectionalMaze  {
    public static void main(String[] args){
        //creating the maze
        boolean [][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
//        printDirections(maze , 0, 0 , "");

        //printing the route with the array of same size
        int[][] paths  = new int[maze.length][maze.length];
        printDirectionalPath(maze , 0 , 0 , "" , paths , 0);
    }

    //here wa can go to 4 directions to reach end of the maze
    static void printDirections(boolean[][] maze , int row , int col , String processed){
        //the very base case
        if(row == maze.length -1 && col == maze[0].length -1){
            System.out.println(processed);
            return;
        }

        //and stop the funtion from executing
        if(!maze[row][col]){
            return;
        }


        //to make this possible we have to make it visited cell false
        maze[row][col] = false ;



        //the first call
        if(row < maze.length -1){
            //make the row call
            printDirections(maze ,row +1 , col , processed + "D");
        }
        if(col < maze[0].length -1){
            printDirections(maze , row , col +1,  processed + "R");
        }

        //call for up
        if(row > 0 ){
            printDirections(maze , row -1 , col , processed + "U");
        }

        //call for left
        if(col > 0 ){
            printDirections(maze , row , col -1 , processed + "L");
        }

        //ater all we are making it as it is
        maze[row][col] = true;
    }

    static void printDirectionalPath(boolean[][] maze, int rows, int cols, String processed, int[][] paths, int stepCount){
        //base case
        if(rows == maze.length -1 && cols == maze[0].length -1 ){
            //printing the Directions
            System.out.println("\n" + processed + ": ");
            //include this function calls to the patCounth
            paths[rows][cols] = stepCount;
            //then we have found the path so that we need to print
            for(int[] arr : paths){
                System.out.println(Arrays.toString(arr));
            }

            return;
        }

        //CHECKING IF THE CELL IS ALREADY VISITED IF IT IS THEN RETURN THE FUNCTION FOR THAT CALL
        if(!maze[rows][cols]){
            return;
        }

        //else we are visiting the cell  so MARK it as a false
        maze[rows][cols] = false;
        //and marking the path
        paths[rows][cols] = stepCount;

        //MAKING 4 DIRECTIONAL FUNCTION CALLS
        if(rows < maze.length-1){
                //CALL FOR DOWN DIRECTION
            printDirectionalPath(maze, rows+1, cols, processed + "D", paths , stepCount +1);
        }

        if(cols < maze[0].length-1){
                //CALL FOR  RIGHT DIRECTION
            printDirectionalPath(maze , rows, cols+1, processed + "R", paths , stepCount+1);
        }

        if(rows > 0 ){
                //CALL FOR UP THE ROW WILL DECREASE
            printDirectionalPath(maze , rows-1, cols, processed + "U", paths, stepCount+1);
        }

        if(cols > 0){
                //CALL FOR LEFT THE COLUMN WILL  DECREASE
            printDirectionalPath(maze, rows, cols-1, processed + "L" , paths, stepCount+1);
        }

        //while returning making the maze as it was
        maze[rows][cols] = true;
        paths[rows][cols] = 0;
    }
}
