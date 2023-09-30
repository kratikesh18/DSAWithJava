package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.PackagesStaticEtc.SingletonClass;

public class Singleton {
    //the class which allows you to create only one object , is called as singleton clsss

    // so its constructor should be private, because if the constructor is called then
    // the new object is creating , to prevent this we need constructor should be private

    //creating a private constructor
    private  Singleton(){

    }

    //singleton class have only instance , so creating it and returning it via function getInstance();
    private static Singleton instance;


    //returning the instance via getInstance function
    public static Singleton getInstance(){
        //creating  instance of the  Singleton class
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

}
