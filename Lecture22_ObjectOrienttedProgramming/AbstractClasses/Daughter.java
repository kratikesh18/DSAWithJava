package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.AbstractClasses;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I will became Doctor");
    }

    @Override
    void partner() {
        System.out.println("I wanna marry Kartikesh" );
    }

    //and we can override the normal function in the parent class

    @Override
    void normFunc() {
        System.out.println("This is overridden method of the normFunc in Daughter class");
    }
}
