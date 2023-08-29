package com.DSAWithJava.Lecture14;

public class FindSetBits {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(countSetbits(n));
    }

    static int countSetbits(int n ){

        int count =0;
//        while(n >  0 ){
//            if((n&1) == 1){
//                count ++ ;
//            }
//            n = n>>1;
//        }

        while (n > 0){
            count++;
            n -= n & (-n);
        }
    return count;
    }


}
