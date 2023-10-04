package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.AbstractClasses;

public class Son extends Parent{
    public Son(int age) {
        super(age);

    }

    // if we don't override the methods here we also have to make it as abstract class
    @Override
    void career() {
        System.out.println("I wanna be Programmer");
    }

    @Override
    void partner() {
        System.out.println("I wanna marry Pratiksha" );
    }
}
