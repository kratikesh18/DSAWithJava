package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.InterFaces;

public class Main {
    public static void main(String[] args) {
        //creating the object of the car class which is implementing two interfaces
        //engine and breake
        CAr car = new CAr();


        //dynamic method dispatch can be used here also
        //Engine car = new CAr();  //by uncommenting only methods in
        // Engine interface can be accessible

        //Brake car = new CAr(); //by uncommenting only methods in
        //Brake interface will be accessible


        //executing the overridden methods
        car.start();
        car.accelerate();
        car.breake();
        car.stop();


        //attention to apply dynamic method dispatch
        //the object is to be type of Interface
        Media mediaCar = new CAr();
        mediaCar.start();

        System.out.println();
        System.out.println();
        System.out.println("Executing the GreatCar\n");

        //fixed and created the GreatCar
        GreatCar greatCar = new GreatCar();

        greatCar.start();
        greatCar.playMusic();




    }



}
