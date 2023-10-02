package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.AcessControl;

public class AccessSpecifiers {
    //this class have some instance variable
    private int num ;
    int num1 ;

    //the other package goes in the abstraction class;


    //methods
    public void hey(){
        System.out.println("this is public function ");
    }

    protected void hey1(){
        System.out.println("this is protected function");
    }

    private void hey2(){
        System.out.println("this is private function ");
    }

    //here we also have a function with no modifier or specifier
    void hey3(){
        System.out.println("I have no Modidifier");
    }

    public static void main(String[] args) {
        //the private function is only accessible in this class only and can't be accessed by any other class
        AccessSpecifiers obj = new AccessSpecifiers();
        obj.hey2();     //private one

        //the public and protected also
        obj.hey();      //public one

        //this is protected one
        obj.hey1();

        //and the not modifier one
        obj.hey3();



        //Some NOTES:
        /*
        1.private : for the sensitive data
        2.no-modifier: when don't want to use it outside the package
        3.public ; Accessible from everywhere
        4.protected : Accessed by the same class and other classes by the subclasses,
                    and can be accessed only from the OBJECT OF THE SUBCLASS ONLY


         */
    }
}
