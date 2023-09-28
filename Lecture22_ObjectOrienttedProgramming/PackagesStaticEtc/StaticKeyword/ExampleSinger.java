package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.PackagesStaticEtc.StaticKeyword;

public class ExampleSinger {
    public static void main(String[] args) {
        //the below objecs of Singers class are created because the Singers class is
        //present in the same package , that is also we dont need to import that class .
        Singers taylor = new Singers(32, "Swift" , false);
        Singers selena = new Singers(26, "Gomez" , false);


        //static means the variable/method is object independant
        //to use or acess those we dont need to create the object of the class
        //they can be acessed via just class name

        System.out.println(taylor.numberOfSingers);
        System.out.println(selena.numberOfSingers);

        //the same thing is for Singer class itself
        System.out.println(Singers.numberOfSingers);    //here the suggestion is removed
        //System.out.println(Singers.age);  //statically calling non static vars will throw error

        System.out.println(taylor.lName);

        //Static and non-static methods //inside out
        //we can call static function directly from here
        heyFunction();

        //but if we need to call the non-static function we need to create
        //an instance of the class where the function lies
        ExampleSinger obj = new ExampleSinger();
        obj.helloFunction();
        //above we created the object of the same class we are in right now
        //the only we can access that funtion


        //Playing with non-static functions
        ExampleSinger obj2 = new ExampleSinger();
        obj2.hola();
    }


    //A static function does not need an instance to execute
    //here is a static function
    static void heyFunction(){
        System.out.println("Hey ya this is static function!");
        //but here we cannot directly use a non-static function because it requires object
        //helloFunction();  // will throw an error
        //in order to acess it we need to create an object
//        ExampleSinger tempObj = new ExampleSinger();
//        tempObj.helloFunction();
        //now we can use it via creating the object
        //WILL GIVE ERROR OF STACK OVERFLOW TWO FUNCTIONS CALLING EACH OTHERS AGAIN AND AGAIN


    }

    //A non-static function need an object or instance to execute (Mandatorily)
    void helloFunction(){
        System.out.println("Hello from non-static function");
        //we can use static function here without any hesitation
        heyFunction();  //because it is static
    }

    void hola(){
        System.out.println("Hola Programmer again Non-static");
        //a non static can allow non static and  static
        //if other non-static comes in then it will use the object of this non-static funtion
        arigato(); //this function will be using the hola functions object
    }
    void arigato(){
        System.out.println("arigato gozaimas programmee");

    }
}
