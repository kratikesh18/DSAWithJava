package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.FourPrinciples.Polymorphism;



public class Triangle extends Shapes {
  @Override     //this is just annotation for checking if the method is overridden or not
  //it will throw error if the method is not overridden
  void area(){
        System.out.println("I'm in the Triangle");
    }
}
