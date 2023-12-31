package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.FourPrinciples.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Square square = new Square();
        Triangle triangle = new Triangle();

        //polymorphism if of two types one is compile time and another is Runtime
        //compile time contains method overloading
        //and runtime contains method overriding

        System.out.println("Compile time polymorphism" );
        //example of method Overloading
        Shapes rectangle = new Square();
        rectangle.area();
        System.out.println(rectangle.area(4,5));


        System.out.println("Runtime polymorphism");
        //this is the example of the Method overriding
        shapes.area();
        square.area();
        triangle.area();

        Shapes shapes1 = new Square();
        shapes1.area();
        //in the above example the objects area method will be called because
        //by refVar we can determine what can be access but the Object can type
        //determines what to run

        //overriding the method toString() in the Shape class
        //this is the overridden method
        System.out.println(shapes1);


        //can overriding the static methods are possible
        //caling it via the reftype parent and obj type chld

//        Shapes shapes2 = new Triangle();
//        shapes2.heyGreeting();  // printing the method from shapes class
            //we have tp directly call it from the class

//        Triangle.heyGreeting();
//        Shapes.heyGreeting();     //figure it out
        //they are not overriding because they are static
        // "BECAUSE : OVERRIDING IS DEPEND ON THE OBJECTS , AND STATIC IS NOT DEPEND ON
        // ANY OBJECT THATS WHY STATIC METHODS ARE NOT OVERRIDDEN

    }
}
