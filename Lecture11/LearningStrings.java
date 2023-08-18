package com.DSAWithJava.Lecture11;

public class LearningStrings {
    public static void main(String[] args) {
        //Declaring the String
        String name = "kartikesh";
        String name2 = "kartikesh";
        //the above reference variales are pointing towards the same objects
        //to verify theis
        System.out.println(name == name2);      //this will give us true
        //those String objects are created in String pool in heap memory  //to more space optimisation
        //where the refvars are stored in stack memory

        //  String ARE IMMUTABLE IN JAVA FOR SECURITY REASONS



        // Comparisons of String
        // == checks for the same object or not     //where == is the comparator  // see line 10 for reference
        //also have .equals(otherString) method that checks only values not objects

        //Creating two different String objects of same values
        String a = new String("Pratiksha");
        String b = new String("Pratiksha");

        //Comparing above strings
        System.out.println(a == b);     //Prints false because those objects are created outside of String pool In Heap memory

        //comparing by their values with .equals() method
        System.out.println(a.equals(b)); // prints true because this method only cheking values of two strings





    }
}
