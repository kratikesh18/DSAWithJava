package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.IntroToOOP;

public class WrapperClassesInJava {
    public static void main(String[] args){
        //the belows are primitives         //they take place in Stack memory
        int a = 34;
        int b = 43;
        //primitives not come with properties and methods
        System.out.println(a + " " + b);
        swapt(a,b);
        System.out.println(a + " " + b);


        //the belows are example of Wrapper Class they are stored in HEAP memory
        //take a NOTE : the wrapper class's object comes up with the own methods
        //and properties with it while primitives doesnt have that you can acess it using dot(.) operator

        Integer num  = new Integer(69);
        System.out.println(num);
        Integer num2 = 70;

        System.out.println(num.getClass());     //acessing its properties and methods

        Character ch = 'K';

        swapt(num, num2);
        System.out.println(num + " " + num2);

        Float pi = 3.14f;
    }

    static void swapt(int a , int b){
        int temp = a;
         a = b;
         b = temp;
    }


    //they will not change Because the Wrapper classes are declared as a final classes
    //and anything is final cannot be modified and changed
    static  void swapt(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

}

