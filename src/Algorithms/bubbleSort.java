package Algorithms;

import java.util.Arrays;

public class bubbleSort {
    public static void sortit(int [] arr){
        for(int i =1;i<arr.length;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={4,6, 2 ,3};
        sortit(arr);
        System.out.println(Arrays.toString(arr));
    }
}
