package com.DSAWithJava.Lecture11;

import java.util.Arrays;

public class PrettyPrintingInJava {
    public static void main(String[] args) {
        // % - this is placeholder  // used with format specifiers (many)

        //Simple example of pretty Printing using format specifier
        System.out.printf("My name is %s and I'm %s ." , "Kartikesh" , "CSEnthusiast");
        //using out.printf(); for printing formatted String

        //printing other datatypes by formatting
        float numf = 4324.628239f;
        System.out.printf("\n%.2f \n" , numf); //this will print 2 digts after decimal with rounding off

        //printing the value of pi
        System.out.println(Math.PI);
        //printing formatted value of pi
        System.out.printf("%.3f \n" , Math.PI);

         // Operator (+)  can be only works with primitives
        System.out.println('K' + 'P');  //TRICK HERE : this will print the sum of the ASCII Values of chars
        //to print them by concating one of them have to be String type  ;
        System.out.println('K'  + "P");         //else two of them have  to be String type
        System.out.println("P" + "K");

        // + will also work as
        System.out.println('a' + 2); // will print 99 because ASCII of 'a' is 97 and + 2 is 99
        //to print c we have to typecast them to char
        System.out.println((char)('a' + 2));    //this will print c


        // (+) operator is only operator in java used operator overloading to concat other objects with string
        System.out.println("kartkesh" + 18);
        System.out.println(true + " is boolean ");

        // with complex objects
       // System.out.println(new int[]{4,3,2,1} + new Interger(34));  //this line gives error because no string and no primitives are present
        //to print them we have atleast one of type string
        System.out.println(Arrays.toString(new int[]{4,3,2,1}) + new Integer(43));  //here array is converted into string thats why it is working;


        //this is also acceped
        System.out.println(new int[]{4,3,2,1} + " " + new Integer(69) );   //will print unreadable codd for 1st argument

        // jAVA DOES NOT SUPPORT OPERATOR OVERRIDING (IT CAUSES POOR CODE)

    }
}
