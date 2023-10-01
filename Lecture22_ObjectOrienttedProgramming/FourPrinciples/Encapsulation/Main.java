package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.FourPrinciples.Encapsulation;

public class Main {
    public static void main(String[]args){
        Car car = new Car();
        //we cant directly acess the data members of the encapsulated class
        //because they are always be private .

        car.setMaxSpeed(34);
        System.out.println(car.getMaxSpeed());

        car.setMaxCapacity(50);
        System.out.println(car.getMaxCapacity());


    }
}
