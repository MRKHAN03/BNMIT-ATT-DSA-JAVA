package Algorithms;

public class kadaneAlgorithm {
    public static void main(String[] args) {
        int [] arr = {5,-8,1,2,-1,4};
        int cMax=arr[0];
        int gMax=arr[0];
        for(int i = 1;i<arr.length;i++){
            cMax = Math.max(arr[i],cMax+arr[i]);
            gMax = Math.max(cMax,gMax);
        }
        System.out.println("Maximum subarray sum is : " + gMax);
    }
}
