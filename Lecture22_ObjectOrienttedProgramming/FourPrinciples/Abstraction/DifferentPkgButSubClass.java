package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.FourPrinciples.Abstraction;

import com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.AcessControl.AccessSpecifiers;

public class DifferentPkgButSubClass extends AccessSpecifiers {

    public static void main(String[] args) {
        AccessSpecifiers obj4 = new AccessSpecifiers();

        //public is accessible
        obj4.hey();

        //protected also available becauase of the inheritance
        //obj4.hey1();  //but we can't access it like its main object
        //to access this we need to create an object of the current class

        DifferentPkgButSubClass obj1 = new DifferentPkgButSubClass();
        obj1.hey1();    //this is the way to acess the protected in the subclass

        //and the public is accessible no worries
        obj1.hey();

        //private is not available and default one is also not available
        //obj1.hey2();
        //obj1.hey3();


    }
}
