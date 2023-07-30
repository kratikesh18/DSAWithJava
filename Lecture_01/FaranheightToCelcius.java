package com.DSAWithJava.Lecture_01;

import java.util.Scanner;

public class FaranheightToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float far = input.nextFloat();

        //converting to the Celsius
        float cel  = (far - 32)  * 5/9;

        System.out.println("the Celsius Value is : "+ cel + "deg Celsius");
    }
}
