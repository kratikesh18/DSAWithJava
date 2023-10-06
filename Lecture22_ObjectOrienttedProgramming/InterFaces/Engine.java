package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.InterFaces;

public interface Engine {
    //imagine as a abstract class
    //but the variables in it are static and  final by default
    static final int COST = 4000000;    //because its final then we have to initialize it

    //it have some methods
    void start();
    void  stop();
    void accelerate();
}

