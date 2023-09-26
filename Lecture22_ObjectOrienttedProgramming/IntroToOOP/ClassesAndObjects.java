package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.IntroToOOP;

public class ClassesAndObjects {
    public static void main(String[] args){
        //declaring the objects
        Student studentone ;
        //initializing object
        studentone = new Student();
        //if we print the without instatntiation it will print default values
        System.out.println("Printing the default values witohut instatntiation");
        System.out.println(studentone.marks + " " + studentone.nam + " " + studentone.rollNo);




        //creating the object of the below class
        Student student1 = new Student();
        Student student2 = new Student();

        student1.nam = "Kartikesh";
        student1.marks = 91.34f;
        student1.rollNo = 34;



        System.out.println(student1.marks);
        System.out.println(student1.rollNo);
        System.out.println(student1.nam);


        student2.rollNo = 321;
        student2.nam = "Joie";
        student2.marks = 63.34f;


        System.out.println("Printing data of second object");
        System.out.println(student2.nam);
        System.out.println(student2.rollNo);
        System.out.println(student2.marks);



        //How new Keyword allocated memory in runtime
        //if we create an object
        Student one = new Student();
        //and pointed on the another ref var to it it will point to the same object
        Student two = one;

        one.nam = "Kartikesh";
        System.out.println(one.nam + " " + two.nam);

        // if we changed it
        two.nam = "Jon Snow";
        System.out.println(one.nam + " " + two.nam);
    }


}
    //creating the class outside the outer class so
class Student{
    int rollNo ;
    float marks;

    String nam;

}
