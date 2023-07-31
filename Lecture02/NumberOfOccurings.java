package com.DSAWithJava.Lecture02;

public class NumberOfOccurings {
    public static void main(String[] args) {
        int n = 1457327417;
        //count the occurings of 7
        int count = 0 ;
        int numberOfOccuring = 0 ;
        while (n  > 0){
            int lastDigit = n %10;
            if(lastDigit == 7){
                count++ ;
            }
            n = n/10;
        }

        System.out.println("the count of 7 in the n is : " + count);
    }
}
