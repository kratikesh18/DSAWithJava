package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.FourPrinciples.Polymorphism;

public class Square extends Shapes{
    @Override
    void area(){
        System.out.println("I'm in the Square");
    }

    //overriding the toString method

//    @Override
//    public String toString() {
//        return "Hello this is overridden toString ";
//    }

    //if the above method overriding is not happens then the the default toString method is
    //called because "Every Class we Create is Inherited by the Object class of Java"
    //thats why the toString method which is method of object class is run "
}
