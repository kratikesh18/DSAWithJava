package com.DSAWithJava.Lecture11;

public class StringBuilderNdStringPerformance {
    public static void main(String[] args) {
        String letters = "";
        //adding alphabates to the letters string
        for(int i = 0 ; i < 26 ; i++){
            char ch = (char) ('a' + i );     //have to convert into char because returning int
            letters = letters + ch ;
        }
        System.out.println(letters);

        //the above code will take n^2 complexity for space because of Strings are Immutable
        //that's why it creating new object every iteraton and pointing revar (letters) to them
        //to avoid this we have StringBuilder Class which helps to mutate the String

        StringBuilder letters2 = new StringBuilder();

        for(int i = 0 ; i < 26 ; i++){
            char ch = (char)('a' + i);
            letters2  = letters2.append(ch);
        }
        System.out.println(letters2);

        //the above code will also do the same but not occupying extra space

    }
}
