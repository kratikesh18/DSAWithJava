package com.DSAWithJava.Lecture03;

public class Swap2Nums {
    public static void main(String[] args) {
        int a = 34;
        int b = 13;

        SwapNums(a ,b);
    }
    static  void SwapNums(int x, int y ){
        int temp = x ;
         x = y;
         y = temp;
        System.out.println(x + " "+y);
    }
}
