package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.FourPrinciples.Inheritance;

public class Main {
    public static void main(String[] args){
        //creating an instance of the box class
        Box box1 = new Box();
        System.out.println(box1.height + " " + box1.length + " " + box1.width);

        //creating 2nd object
        Box box2 = new Box(4);
        System.out.println(box2.height + " " + box2.length + " " + box2.width);

        Box box3 = new Box(3,5,7);
        System.out.println(box3.height + " " + box3.length + " " + box3.width);

        //creating more  object of having same values of obbject 2
        Box box4 = new Box(box2);
        System.out.println(box4.height + " " + box4.length + " " + box4.width);

        NewBox newBox = new NewBox(); //we cant do that here
        System.out.println(newBox.height + " " + newBox.weight + " " + newBox.length + " " + newBox.width);

        NewBox newBox1 = new NewBox(6);
        System.out.println(newBox1.weight + " " + newBox1.length);

        //setting up all the parameters which are inherited and the current class
        //the super keyword is used in child constructor  to set the parent constructors
        NewBox newBox2 = new NewBox(1,2,3,4);
        System.out.println(newBox2.length + " " + newBox2.width + " " + newBox2
                .height + " " + newBox2.weight);




        //some experiments
        //trying to create Box type refVar and instantiating it with NewBox instance
        Box box5 = new NewBox(6,5,4,3);
        //trying to acess the weight member which is not the part of the Box class
        //System.out.println(box4.weight);    //we cant acess it because
        //it is the type of refVar which determines which memebers can be acessed not
        //not the object


        //tryin to invert the above statement
//        NewBox newBox3 = new Box(4,3,6);
        //here we can see it is giving us error
        //because if the object is type of parent class then how it can acess the constructor of chld class
        //and parent class does not have any idea about weight so its giving us eror




    }
}
