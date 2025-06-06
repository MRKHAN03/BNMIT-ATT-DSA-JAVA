package Algorithms;

import java.util.Arrays;

public class mergeSortedArrays {
    public static int[] merging(int [] arr1 ,int[] arr2 ){
        int n1=arr1.length;
        int n2 = arr2.length;
        int [] merged = new int [n1+n2];
        int i=0,j=0,k=0;

        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                merged[k++]=arr1[i++];
            }
            else{
                merged[k++]=arr2[j++];
            }
        }

        //check for remaining parts in both arrays
        while (i<n1){
            merged[k++]=arr1[i++];
        }
        while (j<n2){
            merged[k++]=arr2[j++];
        }
        return merged;
    }

    public static void main(String[] args) {
        int []arr1 = {1,2,3,0,0,0};
        int[] arr2 ={2,5,6};
        int [] merged = merging(arr1,arr2);
        System.out.println(Arrays.toString(merged));
    }
}
