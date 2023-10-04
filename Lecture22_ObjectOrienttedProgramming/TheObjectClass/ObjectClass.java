package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.TheObjectClass;

import java.util.Arrays;

public class ObjectClass {
    int num;
    int age;

    ObjectClass(int num, int age) {
        this.num = num;
        this.age = age;
    }

    //methods which can be overridden
    public ObjectClass() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //overriding equals mehtod
        return this.age == ((ObjectClass)obj).age;  //typecasted the argument to the
        // current class and this is for the method where it is hitted
    }

    /*      //this method will covered in interface lecture
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
     */

    //toString() and finalize() is covered previously
    /*
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
     */

    //the object class contains some method

    public static void main(String[] args){
        //Case 1
        ObjectClass obj = new ObjectClass(23,11);
        ObjectClass obj2 = new ObjectClass(24, 11);


        //Case2
//        ObjectClass obj = new ObjectClass(43,11);
//        ObjectClass obj2  = obj;
        //overriding some object methods
        System.out.println(obj.hashCode()); //this will give different hashCodes in case 1
        System.out.println(obj2.hashCode());//and will give same in case 2

        //The above example states that
        // one object one hashcode
        //hashcode is the unique numric representation of the object


        //the .equals() method
        if(obj == obj2){
            System.out.println("Both objects are same ");   //true in the case 2
        }

        if(obj.equals(obj2)){
            System.out.println("obj is euqal to obj2");
        }

        //.equals() vs ==
        // == is a comparator only check if the both refVars are pointing to the same objects
        //and .equals() is checking for actual content
        //in the overridden method of .equals() , we checked ages of the objects


        //the object contains some .getClass() method ;
        System.out.println(obj.getClass()); //this will give us the package of the class
        System.out.println(obj.getClass().getName());   //.getClass have some of the methods
        //getClass is final method that's why we cant override it
        //.getClass() is used for getting information about the class


        //the instance of operator
        //it throws a boolean value if the object is instance or not
        System.out.println(obj instanceof Object);

    }
}
