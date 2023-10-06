package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.InterFaces;

public class MediaPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Music Playin");
    }

    @Override
    public void stop() {
        System.out.println("Music Ends");
    }
}
