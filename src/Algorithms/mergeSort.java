package Algorithms;

import java.util.Arrays;

public class mergeSort {
    public static void MergeSort(int [] arr){
        if(arr.length<2){
            return;
        }
        int mid = arr.length/2;
        int [] left = Arrays.copyOfRange(arr,0,mid);
        int [] right= Arrays.copyOfRange(arr,mid , arr.length);
        MergeSort(left);
        MergeSort(right);
        merge(arr,left,right);
    }
    public static void merge(int[]arr,int [] left,int[] right){
        int i=0,j=0,k=0;

        while(i < left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else {
                arr[k++]=right[j++];
            }
        }

        while (i<left.length){
            arr[k++]=left[i++];
        }

        while (j< right.length){
            arr[k++]=right[j++];
        }
    }

    public static void main(String[] args) {
        int [] arr={5,9,1,6,4,-2};
        MergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
