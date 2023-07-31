package com.DSAWithJava.Lecture02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while(true){
            int ans = 0 ;
            System.out.print("Enter Operator : ");
            char operator =  input.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                System.out.println("Enter Two Numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(operator == '+'){
                    ans = num1 + num2;
                }
                if(operator == '-'){
                    ans = num1 - num2;
                }
                if(operator == '*'){
                    ans = num1 * num2;
                }
                if(operator == '/'){
                    if(num2 == 0 ){
                        ans = 0 ;
                    }
                    else {
                        ans =  num1/num2;
                    }
                }

                if(operator == '%'){
                    ans = num1 % num2;
                }
                System.out.println(ans);

            }
            else if(operator == 'x' || operator == 'X'){
                System.out.println("The Program is Closed.");
                break;
            }
            else{
                System.out.println("Enter Valid Input ! ");
            }
        }
    }
}
