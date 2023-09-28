package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.PackagesStaticEtc.StaticKeyword;

public class StaticInitialization {
    static int a = 6;
    static int b ;

    //initializing b with static block
    static{
        System.out.println("Hey ya It's static block");
        b = a *5;
    }


    //creating main function - main function can be anywhere because it is static
    public static void main(String[] args){
        //creating an object of current class
        StaticInitialization obj = new StaticInitialization();
        //static block will be executed now

        //printing values of static variables //call them by their class name
        System.out.println(StaticInitialization.a + " " + StaticInitialization.b);

        //creating another object of same class
        StaticInitialization obj2 = new StaticInitialization();
        //here you run the code till now you can see that static block isn't executed again
        //because StaticBlock is initialized once only after creation of first object

       //if we perform any operation on static variable now ,
       //then it will be performed on initialized values of vars
        StaticInitialization.b += 39;
        System.out.println(StaticInitialization.a + " " + StaticInitialization.b);


    }
}
