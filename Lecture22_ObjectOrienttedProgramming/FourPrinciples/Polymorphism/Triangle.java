package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.FourPrinciples.Polymorphism;



public class Triangle extends Shapes {
  @Override     //this is just annotation for checking if the method is overridden or not
  //it will throw error if the method is not overridden
  void area(){
        System.out.println("I'm in the Triangle");
    }


    //trying the static method overriding
    //@Override
    static void heyGreeting(){
        System.out.println("Hey this is static method from Triangle");
    }
}
