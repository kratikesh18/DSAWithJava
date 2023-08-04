package com.DSAWithJava.Lecture05.QuestionsOnLinearSearch;

public class NumbersOfEvenDigits {
    public static void main(String[] args) {
//         int[] nums = {12, 345, 2, 6, 7896};
         int[] nums = {555,901,482,1771};
         int ans = findNumbers(nums);
//        System.out.println("the number of even digit are : "+ ans );
    }

    static int findNumbers(int[] nums) {
        int count = 0 ;
        for(int i = 0 ; i< nums.length ; i ++){
            if(even(nums[i])){
                count ++ ;
            }
        }
        return  count;
    }

     static boolean even(int num) {
        int  numsize = digits(num);
        return (numsize %2 == 0 );
    }

     static int digits(int num) {
        int size = 0 ;

        while (num > 0){
            size++;
            num/=10;
        }
        return size;
    }


}
