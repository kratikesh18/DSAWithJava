package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.PackagesStaticEtc.SingletonClass;

public class Main {
    public static void main(String[] args) {
        //creating 1+ objects of singleton class
        //Singleton obj2 = new Singleton();  //will throw error after creating singleton class
        //Singleton obj = new Singleton();

        //it allowss it to create one plus objects of the class
        //but it should allow us to make only one object


        //but we can create objects using same instance with getInstance method
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();
    }
}
