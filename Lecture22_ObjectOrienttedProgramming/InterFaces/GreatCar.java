package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.InterFaces;

public class GreatCar{
    //its having its private engine
    private Engine engine;
    private Media player = new MediaPlayer();

    //having constructor
    GreatCar(){
        this.engine = new PowerEngine();
    }

    GreatCar(Engine engine){
        this.engine = engine;
    }


    //it have some methods
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void playMusic(){
        player.start();
    }

    public void pauseMusic(){
        player.stop();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
