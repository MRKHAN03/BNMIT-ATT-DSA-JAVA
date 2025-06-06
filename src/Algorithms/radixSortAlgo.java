package Algorithms;

import java.util.Arrays;

public class radixSortAlgo {

    public static void radixSort(int [] arr){
        int max = getMax(arr);
        for(int exp=1;max/exp>0;exp*=10){
            countSort(arr,exp);
        }
    }

    private static int getMax(int []arr){
        //find max
        int k = arr[0];
        for(int i =0;i<arr.length;i++){
            if (arr[i]>k){
                k = arr[i];
            }
        }
        return k;
    }

    private static void countSort(int[] arr , int exp){

        int[] output = new int[arr.length];
        int [] count = new int[10];

        for(int i=0;i< arr.length;i++){
            int digit= (arr[i]/exp)%10;
            count[digit]++;
        }

        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        for(int i = arr.length-1;i>=0;i--){
            int digit = (arr[i]/exp)%10;
            output[--count[digit]]=arr[i];
        }
        for(int i=0;i< arr.length;i++){
            arr[i]=output[i];
        }
    }

    public static void main(String[] args) {
        int [] arr = {325,3,246,192,5};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
