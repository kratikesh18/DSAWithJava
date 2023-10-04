package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.AbstractClasses;

public abstract class Parent {
    int age ;

    //can we create constructor in the abstract classes yeah it allows us to create it
    public Parent(int age) {
        this.age = age;
    }
    //but it is not make sense to create the constructor over here
    //because we can't directly instantiate the abstract class because
    //we cant create the object of the abstract class

    //this will be the abstract class because it contains 1 or more abstract method

    //abstract methods are method which have to override in the inherited class
    //no function body is required
    abstract void career();
    abstract void partner();

    //the above methods have to be overridden in the child classes thats what the
    //abstract methods made for


    //can we create abstract constructors ?
    //lets try
    //abstract Parent(int age); // no we cant because how it will execute if it does not have
    //body THATS ALSO THE REASON FOR NOT TO CREATE THE OBJECT ALSO




    //can we create ABSTRACT STATIC MEHTODS ?
    //NO , we can't create abstract static methods becsuse abstract methods are
    //all about overriding and static methods are not overridden thats why
    // we cant create ABSTRACT STATIC METHOD
    //BUT WE CAN CREATE STATIC MEHTODS & variables IN THE ABSTRACT CLASSES
    static void heyGreet(){
        System.out.println("Hello Im from the static function of abstract class");
    }

    //we can create normal methods in the abstract class
    void normFunc(){
        System.out.println("Its a normal function in the abstract class");
    }




    // cant create the *final abstract class because it have to be inherited
    //and by making the final class then it cant be inherited
    //final keyword prevent the class from getting inherited
    //but the abstract class have to inherited thats why

}
