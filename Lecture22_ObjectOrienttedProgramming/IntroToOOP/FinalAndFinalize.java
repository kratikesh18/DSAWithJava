package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.IntroToOOP;

public class FinalAndFinalize {
    public static void main(String[] args){

        //creating the final variable
        final float PI = 3.14f;
//        PI = 34.34f;          //we cant modifiy it


        //below we created the primitive datatype which is temp
        Temp obj1 = new Temp("Gurl1");
        obj1  = new Temp("Gurl2");
        //this is the declaration of the non primitive datatype

        //if we made it final we cannot reassign it
        //the same case will not be applied below because final keyword
        final Temp obj2 = new Temp("Gurl3");
//        obj2 = new Temp("Gurl4");             //thows an error
        //we did the same thing which we did for obj1 but here it giving us error


        //the below code for destructor
        Temp obj3;
        for (int i =0 ;i<1000000; i++){
            obj3 = new Temp("something");
        }

    }
}

class Temp{
    final float plank  = 6.26f;                 //we have to initialize it when its declared

    String name ;


    //this is constructor called when the object of this class is created
    public Temp(String name){
        System.out.println("Object is created");
        this.name = name;
    }


    //finalize in java

    //this will executed when the object  is destroyed
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed  ");
    }
}