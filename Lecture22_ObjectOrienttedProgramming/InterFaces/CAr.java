package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.InterFaces;

public class CAr implements Engine , Brake, Media {
    @Override
    public void breake() {
            //it is just normal  overriding the methods from engine and brake class
        System.out.println("Braking normal car");
    }

    @Override
    public void start() {
        System.out.println("Staring normal car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating normal car");
    }



}
