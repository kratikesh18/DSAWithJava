package com.DSAWithJava.Lecture01;

import java.util.Scanner;

public class InputsInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println(n);

        float f = input.nextFloat();
        System.out.println(f);

        char ch = input.next().charAt(0);
        System.out.println(ch);


        //this will not work with the above input types java skipping it idk why
        String name = input.nextLine();
        System.out.println(name);


    }
}
