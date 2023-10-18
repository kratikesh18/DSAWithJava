package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    //here we are creating custom arraylist by our own
    private int[] data;
    private static int DEFAULT_SIZE = 10;   //not dependant on the obects
    private int size = 0;

    //have a constructor which is initializing the data by DEFAULT_SIZE


    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    //creating the add function
    public void add(int n){
        if(isFull()){
            resize();
        }
        data[size++] = n;
    }

    private void resize() {
        //creating the temp of double size
        int[] temp = new int[DEFAULT_SIZE*2];

        //copying data to the temp
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }

        //pointing the data to the temp
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index ){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void setVal(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        //we can create default arraylist provided by java
        //ArrayList<Integer> list = new ArrayList<>();

        //implementing the custom arraylist
        CustomArrayList list = new CustomArrayList();
        list.add(12);
        list.add(24);
        list.add(36);
        System.out.println(list);

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

}
