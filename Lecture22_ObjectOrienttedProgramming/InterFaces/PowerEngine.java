package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.InterFaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Starting Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Power Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Power Engine");
    }
}
