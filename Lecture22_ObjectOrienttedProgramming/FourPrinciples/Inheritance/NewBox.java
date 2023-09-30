package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.FourPrinciples.Inheritance;

//creating a child class of Box class which is inherited by class Box
public class NewBox extends Box {
    //this having same properties of Box class because of inheritance
    int weight;

    //creating the constructor
    NewBox(){
        //default constructor
        super(-1,-1,-1);
        this.weight  = -1 ;
    }
    NewBox(int weight){
        super(0,0,0);
        //this will also set the height if the height is marked as private in the parent class
        //because the super keyword is directly calling the constructor of the parent class

        this.weight = weight;
    }


    NewBox(int length, int width, int height, int weight) {
        super(length, width, height);   //this will set the properties to the parent class
        this.weight = weight;   //this will set the least property of the current classs
        System.out.println("Printing via super keyword " + super.height);
    }




}
