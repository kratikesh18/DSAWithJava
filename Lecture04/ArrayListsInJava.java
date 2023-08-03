package com.DSAWithJava.Lecture04;

import com.DSAWithJava.Lecture01.InputsInJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsInJava {
    public static void main(String[] args) {
        //declaring tha arrayList       "ArrayLists are similar to vector in c++
        ArrayList<Integer>arrList = new ArrayList<>(5);

        //when ArrayList is filled withh intitial capacity
        //then it will create another ArrayList with double capacity and copy data to the new Arraylist
        //And deletes the old ArrayList


        //ArrayList Methods
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        //printing the array list
        System.out.print(arrList);

        //checking if the element is present in list
        System.out.println("\n" + arrList.contains(4));     //return boolean



        //manipulating in ArrayList
        arrList.set(3, 99);     //this will change value at 3rd index
        System.out.println("Printing Modified ArrayList : " + arrList);

        arrList.remove(1);      //will remove passed indexed (1)  value
        System.out.println("Printing Modified ArrayList: " + arrList);

        //printing the individual array element
         int value = arrList.get(2);     //will return the indexed value from array
        System.out.println("The passed indexed value from array is : " + value);


        //taking input via loops

                //UNDERSTATD THE LOGIC OF BELOW CODE
        Scanner input = new Scanner(System.in);
        for(int i = 0 ;i < 5; i++ ){
                arrList.add(input.nextInt());
        }

        System.out.println(arrList);
    }
}
