package com.DSAWithJava.Lecture07;

public class FindElemenInInfiniteArray {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        int target = 14;
        int ans = findElement(arr , target);
        System.out.println(ans);
    }
    static int findElement(int[] arr , int target){
        //we dont know the start and end
//        taking the window of size 2
        int start = 0 ;
        int end  =1;

        while(target > arr[end]){
            int tempStart = end +1 ;
                    //doubleling the size of the window
            end = end  + (end -start +1 ) *2;
            //then updating the start by tempstart
            start = tempStart;
        }

        //now have found the range (start and end )
        return  binarySearch(arr ,target , start ,end );
  }

  static int binarySearch(int[] arr ,int target , int start , int end){
      //initialising the start and end
      while (start <= end){
          //finding the mid
          //this direct value of mid cannot handle by integer thats why we have to optimise the expression see notes for explanation
          //int mid = (start + end )/2  ;
          int mid = start  + (end-start)/2;

          if(target < arr[mid]){
              //that means target is smaller we have to find it on left side
              end = mid-1;
          }else if(target  > arr[mid]){
              //that means target is greater we have to find it on right side
              start = mid+ 1;
          }else{
              //that means we have reach the worst case and the element is found
              return  mid ;
          }
      }
      //that means we don't found the element
      return  -1;
  }


}
