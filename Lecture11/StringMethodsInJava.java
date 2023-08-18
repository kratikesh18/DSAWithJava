package com.DSAWithJava.Lecture11;

import java.util.Arrays;

public class StringMethodsInJava {
    public static void main(String[] args) {
        //String methods
        String name = "        Kartikesh";
        String name2  = "Kartikesh-Pachkawade";
        System.out.println(Arrays.toString(name.toCharArray()));        //it to  print the array we need the Arrays.toString() method
                    //temp object will colleted by garbage collector
        System.out.println(name.length());  //printns length
        System.out.println(name.toLowerCase()); //converts to lowrcase
        System.out.println(name.equals("kartikesh"));   //returns false caseSensitive
        System.out.println(name.trim());    //removes extra spaces
        System.out.println(Arrays.toString(name2.split("-")));   //returns String array and splits them by regular expressions

        System.out.println(name2.charAt(4));    //prints the char at index
        System.out.println(name2.indexOf('r'));

    }
}
