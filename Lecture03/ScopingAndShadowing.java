package com.DSAWithJava.Lecture03;

public class ScopingAndShadowing {
    static int x = 5;       //this var will shadowed at line 10

    public static void main(String[] args) {
        System.out.println(x);
        x  = 43;    // we can change the global scoped var


        int x = 234;
        System.out.println(x);

        //block scope
        {
//            int x = 43 ;      // will not work because x is declareed parent block
            int c = 34;
        }
        //System.out.println(c);      //this will not work because c is not in the current scope

        //loop scope
        for(int i = 0 ;i< 2 ; i++ ){
            System.out.println(i+1);        // i lies in the loop scope only
        }

        //printing global scoped var
        printVAr();
    }
    static void printVAr(){
        System.out.println("printing throgh function " + x);  //the static var used here because it is global var
    }
}
