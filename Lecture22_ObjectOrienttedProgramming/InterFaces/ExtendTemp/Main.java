package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.InterFaces.ExtendTemp;

public class Main implements InterfaceB{
    //this basically means if the interfaces get inherited from another interfaces
    //then if we are implementing the inherited interface then we have to override the
    //both of the methods containing interfaces accordingly
    @Override
    public void Hello() {
        System.out.println("this  is Hello");
    }

    @Override
    public void hey() {
        System.out.println("this is Hey");
    }
}
