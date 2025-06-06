package Algorithms;

import java.util.Arrays;
//shift
public class insertionSort {
    public static void sort(int [] arr){
        for (int i =1;i< arr.length;i++){
            int temp =arr[i];
            int j = i-1;
            while (j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr={5,5,9,1,6,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
