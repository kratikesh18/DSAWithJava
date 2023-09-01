package com.DSAWithJava.Lecture15;

public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        System.out.println(newtonMethod(40));
    }

    static double newtonMethod(int n ){
        double x = n;
        double root ;

        while (true){
            //the formula is root = (x + n/x)/2  which is solved by taking reciprocal which is shown below
            root =  0.5 * (x + n/x);

            //finding the error
            if(Math.abs(root - x ) < 0.5){
                break;
            }
            x  = root;
        }
        return root;
    }
}
