package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.FourPrinciples.Inheritance;

public class Box {
    //here we created a Box Class to demonstrate Inheritance
    //Box have some properties
    int length ;
    int width;
     int height;      //if we make it private the child class can't acess it
    //it is only acessed by this class only


    //having constructors to initialize this objects
    Box(){
        //default constructor
        //super();        //it referencing the object class of the java
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    //for cube
    Box(int side){
        this.length = side;
        this.width= side;
        this.height = side;
    }

    //for all three sides
     Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //for other objects related
    Box(Box other){
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;
    }

}
