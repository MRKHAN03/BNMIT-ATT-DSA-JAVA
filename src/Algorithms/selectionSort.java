package Algorithms;

import java.util.Arrays;
//swap
public class selectionSort {
    public static void sort(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={5,5,9,1,6,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
