package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.FourPrinciples.Encapsulation;

public class Car {
    //ths encapsulation is Wrappin up the implementation of the  datatypes and
    //members of the same class

    //by making them private
    private int maxSpeed;
    private int maxCapacity;

    //the above are the encapsulation

    //defining getters and setters
    int getMaxSpeed(){
        return maxSpeed;
    }

    void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    int getMaxCapacity(){
        return maxCapacity;
    }

    void setMaxCapacity(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

}
