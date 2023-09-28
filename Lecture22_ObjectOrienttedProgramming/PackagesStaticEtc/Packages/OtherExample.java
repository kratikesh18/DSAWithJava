package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.PackagesStaticEtc.Packages;


//to import the funtion from other class
import static com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.PackagesStaticEtc.Packages.ExampleOfPackage.*;
public class OtherExample {
    public static void main(String[] args) {

        greeting(); //we imported method from the other class by using package and import keyword
        //the * in the end of the package path is for all the methods contains that class
    }

    public static void greeting2(){
        System.out.println("Hello from OtherExample");
    }
}



