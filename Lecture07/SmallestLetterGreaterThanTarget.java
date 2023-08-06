package com.DSAWithJava.Lecture07;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f' , 'j'};
        char target = 'k';
        System.out.println(findAns(letters , target));
    }
    static char findAns(char[] letters , char target){
        //tkaing 2 pointers
        int start= 0 ;
        int end = letters.length -1;

        while (start<=end){
            //finding the mid
            int mid  = start +(end-start)/2;

            if(target < letters[mid]){
                end = mid-1;
            }else if(target > letters[mid]){
                start = mid +1;
            }else{
                //the answer is found so we have to return the start
                return  letters[start];
            }
        }
        //if we did not find any then we have to return first car because of word wrap
        return  letters[start % letters.length];
    }
}
