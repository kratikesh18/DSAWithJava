package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.PackagesStaticEtc.StaticKeyword;

public class Singers {
    String lName;
    int age;
    boolean married;

    //int numberOfSingers = 0 ; //the number are not depend on the singers who are objects
    //thats why we are declaring as a static it is only be dependant on Singer class

    static int numberOfSingers = 0 ;

    //creating a static method
    static void alert(){
        System.out.println("Hey ya this is alert");
        //System.out.println(this.age);  //this keyword will not gonaa work here
        //because it does not have any
        //those variables are for objects of that class and static not need any object
    }

    Singers(int age , String lName , boolean married){
        this.age = age;
        this.lName = lName;
        this.married = married;
        //this.numberOfSingers += 1; //by using this it is setting up value for that perticular ref var or object
        //and the static variables are have to be called by the class name
        Singers.numberOfSingers  +=1;
    }
}
