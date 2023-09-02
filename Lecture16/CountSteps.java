package com.DSAWithJava.Lecture16;

public class CountSteps {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(findSteps(n , 0));
    }


     static int findSteps(int n , int steps ){
        if(n == 0){
            return steps;
        }

        //if the number is even
         if(n %2 == 0 ){
             return  findSteps(n/2 , steps+1);
         }
         return findSteps(n - 1 , steps +1 );

     }
}
