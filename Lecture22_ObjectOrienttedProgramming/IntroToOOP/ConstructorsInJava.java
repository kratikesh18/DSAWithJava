package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.IntroToOOP;

public class ConstructorsInJava{
    public static void main(String[] args){
        //creating the ovject of the following class
        Test obj = new Test(23,"Kartikesh", 4423);

        //printing the properties was set by the constructors
        System.out.println(obj.marks + " " + obj.rollNo + " " + obj.name);


        //creating the second object of the same class
        Test obj2 = new Test("Stube" , 323 );
        System.out.println(obj2.marks +" " + obj2.rollNo + " " + obj2.name);




        ////creating the object using defalult constructor
        Test obj3 = new Test();
        System.out.println("printing the default constructor ");
        System.out.println(obj3.name + " " + obj3.rollNo + " "  + obj3.marks);


        //creating the object using constructor made by using constructor of diff object

        Test obj4 =  new Test(obj);
        System.out.println(obj4.name + " " + obj4.marks + " " + obj4.rollNo);
    }

}


class Test {
    int marks;
    String name ;
    int rollNo;


    //the below are the EXAMPLES of CONSTRUCTORS OVERLOADING
    //creating a Constructor
    //its a spectial type of funtion which return type is same class
    Test(int marks,String name , int rollNo){
        System.out.println("constructot number 2");
        this.marks = marks;
        this.name = name ;
        this.rollNo = rollNo;
    }


//there can be multiple constructors // Known as Constructor Overloading
    Test(String name , int rollNo){
        System.out.println("construtor no 2");
        this.name = name;
        this.rollNo = rollNo;

    }

    //Constructors can be default
    Test(){

        this(00, "Default" , 00);
        System.out.println("Default constructor");
    }

    Test(Test other){
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks  = other.marks;
    }
}
