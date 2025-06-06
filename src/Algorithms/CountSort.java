package Algorithms;

import java.util.Arrays;

public class CountSort {
    public static void count(int [] arr){

         //find max
         int k = arr[0];
         for(int i =0;i<arr.length;i++){
             if (arr[i]>k){
                 k = arr[i];
             }
         }

         //count array
        int[] count = new int[k+1];

         // freq
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //cumulative freq c=c+p
        //skip index  as there's no previous element for
        for(int i=1;i<=k;i++){
            count[i]+=count[i-1];
        }

        int [] output = new int[arr.length];

        //start from end of ARRAY
        for(int i = arr.length-1;i>=0;i--){
            output[--count[arr[i]]]=arr[i];
        }

//        for(int i=0; i< arr.length;i++){
//            arr[i]=output[i];
//        }

        System.arraycopy(output,0,arr,0,arr.length);
    }

    public static void main(String[] args) {
        int [] arr = {6,4,3,4,1,3,2,3,1};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        count(arr);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    }
}