package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.AcessControl;

public class SamePackage {
    public static void main(String[] args) {
        //public function can be accessed here no worry about public
        //here we not require to import that package

        AccessSpecifiers obj1 = new AccessSpecifiers();
        obj1.hey();

        //protected can be accessed here
        obj1.hey1();

        //but the private is not accessed here
       // obj1.hey2();    //will throw error

        //a function having no modifier can be accessed here in the same package
        obj1.hey3();
    }
}
