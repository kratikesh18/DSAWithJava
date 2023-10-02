package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.FourPrinciples.Abstraction;

import com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.AcessControl.AccessSpecifiers;

public class DiffferPackage{

    public static void main(String[]args){
        AccessSpecifiers obj3 = new AccessSpecifiers();

        //public function
        obj3.hey(); //available

        //this is the only is available
       // obj3.hey1();
       // obj3.hey2();
       // obj3.hey3();

    }
}
