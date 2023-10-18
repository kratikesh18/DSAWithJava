package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.Generics;

import java.util.Arrays;

public class WildCardsExample<T extends Number> {
    //here we are creating custom arraylist by our own
    private Object[] data;
    private static int DEFAULT_SIZE = 10;   //not dependant on the obects
    private int size = 0;

    //have a constructor which is initializing the data by DEFAULT_SIZE


    public WildCardsExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    //creating the add function
    public void add(T n){
        if(isFull()){
            resize();
        }
        data[size++] = n;
    }

    private void resize() {
        //creating the temp of double size
        Object[] temp = new Object[DEFAULT_SIZE*2];

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
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index ){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void setVal(int index, T value){
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
        //here we added wildcard over here
        //so that it restricted the typeParameter to the classes
        //which extends the number class only

        WildCardsExample<Float> list = new WildCardsExample<>();
        WildCardsExample<Integer> list2 = new WildCardsExample<>();
        WildCardsExample<Double> list3 = new WildCardsExample<>();

        //all the datatypes which extends the class Number will allowed

        //but who is not , they are not allowed
        //WildCardsExample<String> list4 = new WildCardsExample<String>();
        //will throw error that is wildCard in java
    }
}
