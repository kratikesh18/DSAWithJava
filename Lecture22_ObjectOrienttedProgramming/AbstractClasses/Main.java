package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        /*
        Parent parent = new Parent() {
            @Override
            void career(String name) {

            }

            @Override
            void partner(String name, int age) {

            }
        }
            //we can't create the object ot the abstract class directly
        */

        System.out.println("For Son");
        //but we can create the object of the child class
        Son son = new Son(20);
        son.career();
        son.partner();

        System.out.println("For Daughter");
        Daughter daughter = new Daughter(19);
        daughter.career();
        daughter.partner();

        //thats the abstract classes

        //can we create constructor in the abstract classes
        //Parent daddy = new Parent(23);    //but we cant create objects of the abstract class like this
        //it will need to implements of the abstract class contains in it



        //we can create static methods in abstract classes
        //calling static method from the abstract class
        Parent.heyGreet();
        //it also can be accessed by the child class
        Son.heyGreet();
        //and also by the object of the child class
        son.heyGreet(); //not recommended


        //we can create normal function in the abstract class also
        //in order to access it we can do that by instance class
        son.normFunc();
        //normFunc() will need the object to access it because it is not static
        //so it will accessed it by using the object of the child class

        //below is the overridden method of the normal function by daughter class
        daughter.normFunc();


        // we can dynamic dispatch mehthod also
        Parent child1 = new Daughter(10);
        child1.career();
        child1.normFunc();

    }
}
