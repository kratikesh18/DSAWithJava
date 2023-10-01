package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.FourPrinciples.Polymorphism;

public class Shapes {


    void area(){
        System.out.println("I'm in the Shapes");
    }

    //if we comment out this parent class's method we can't acess the area which is method  of the other child class // only if the reference variable  is of tye parent
    //type and the object is of type the child type that process will happen whil runtime


    //creating the method of same name for experiment compile time polymorphism
    int area(int length , int breadth){
        return length* breadth;
    }

   // @Override
    static void heyGreeting(){
        System.out.println("Hello this is static method of Shapes class");
    }

}
