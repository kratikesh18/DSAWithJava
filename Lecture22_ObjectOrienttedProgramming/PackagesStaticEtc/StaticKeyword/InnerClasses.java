package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.PackagesStaticEtc.StaticKeyword;
//creating an outer Class
//    class Example{
//        String name;
//          //this class is outer , so it is not dependent on ony other class
            //so we can use it directly & its in the same package also
//        Example(String name){
//            this.name = name;
//        }
//    }

public class InnerClasses {
//    //creating an InnerClass
//    class Example{
//        String name;
//              //to use this class we need an instance of the parent class
//        Example(String name){
//            this.name = name;
//        }
//    }
    static class Example{
        String name;
            //we do not need intance of parent class to create this class instance
            // because it is static not depent on parent object
        Example(String name){
            this.name = name;
        }

        //overriding the toString() method
        //try commenting and uncommenting while revising
    @Override
    public String toString() {
        return "Hey yo ... its overrided toString(), I will not print HashCode ";
    }
}



    //main function
    public static void main(String[] args) {
        Example obj = new Example("Kartikesh");
        //we cant create an instance directly if uncomment innner Example class
        //but we can create it by outer Example class

        //because outer classes are not dependand on any other classes
        //but the inner classes are .
        //to create their instances directly we need to make them static
        //which mekes them independant from parent class



        //Printing the object to understand System.out.println(); method
        System.out.println(obj);    //it will print package path and at the end hashcode
        //this is the default of println method , which is method of static variable out which is in the System class
        //but if we override this toString() method by creating our own then  it will print the overrided statement
    }
}
