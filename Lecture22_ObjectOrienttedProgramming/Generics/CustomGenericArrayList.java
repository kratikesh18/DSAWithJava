package com.DSAWithJava.Lecture22_ObjectOrienttedProgramming.Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T>{
    //here we are creating custom generic arraylist by our own
    private Object[] data;  //used Object class because all
                        //classes are the objects ot class Object
    private static int DEFAULT_SIZE = 10;   //not dependant on the obects
    private int size = 0;

    //have a constructor which is initializing the data by DEFAULT_SIZE


    public CustomGenericArrayList() {
        data = new Object[DEFAULT_SIZE];
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
            //the typeCasting is needed here
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index ){
        //typeCAsting is needed here
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

    public static void main(String[] args){
        //We Made the generic custom arraylist using generics
        //so we can create Arraylist of any Datatype
        CustomGenericArrayList<String> list = new CustomGenericArrayList<>();
        list.add("Kartikesh");
        list.add("Pratiksha");
        list.add("Walter");
        list.add("Saul");
        System.out.println(list);

        for (int i = 0; i <10 ; i++) {
            list.add("ab" + i);
        }
        System.out.println(list);
    }

}
