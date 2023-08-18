package com.DSAWithJava.Lecture11;

import  java.util.Arrays;
public class LearningPrintStreamClass {
    public static void main(String[] args) {
        //objects are created below are temporarily after execution they will hanled by garbage collector
        System.out.println(69);     //println can print any data type
        System.out.println(43.341244f); // printing float datatype
        System.out.println('C');       //printing character
        System.out.println(true);   //printing boolean

        //the above println method is an example of function overloading
        //println goes to .valueOf() method which defines the what's the datatype       //for primitives
        //then accordingly converts them to printable Sting format using .toString() method

        //tying to print objects with println
        System.out.println(new int[]{5,4,3,2,1}); //this line prints the string representation of the given object (not beneficial)
        //to print this object we need help of the class which helps to print accordingly like Arrays
        System.out.println(Arrays.toString(new int[]{5,4,3,2,1}));
        //here we CAN say function overriding is happening

        //to acces the class methods for *primitive convert them to the nonprimitve objects they can be Arrays , tree ,animal, human , student etc.
        Integer num  = new Integer(43);
        System.out.println(num.toString());     //this will do the same thing which println(43); does thats why grey

        System.out.println(num);    //this  will performing same thing as line 22 and 23 are performing

        //Put any Datatype to their wrapper class to use their many methods  like above example
    }
}
