package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.AcessControl;

public class SubClassSamePkg extends AccessSpecifiers{

    public static void main(String[] args) {
        //creating the object of the accessSpecifier
        AccessSpecifiers  obj2 = new AccessSpecifiers();

        //public is available
        obj2.hey();

        //protected is available
        obj2.hey1();

        //private is not available
        //obj2.hey2();

        //no moidifier is available
        obj2.hey3();

    }
}
