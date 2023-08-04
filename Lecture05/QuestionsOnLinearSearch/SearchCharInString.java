package com.DSAWithJava.Lecture05.QuestionsOnLinearSearch;

public class SearchCharInString {
    public static void main(String[] args) {
//        String name = "kartikesh";
        char target = 't';
        String name  = "";
        charSearchInString(name , target);
    }

     static void charSearchInString(String name, char target) {
        if(name.length() == 0 ){
            System.out.println("String have zero characters.");
            return;
        }
        for(int i = 0 ;i<name.length(); i++){
            if(name.charAt(i) == target){
                System.out.println(target + " is present at index : " + i);
                return;
            }
        }
         System.out.println("Target characer not found.");
    }
}
