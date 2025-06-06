package Algorithms;

public class RecurrBinSearch {
    public static int reccursiveBinSearch(int [] arr , int key , int start , int end){

        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if (arr[mid]==key)
            return mid;
        else if(key>arr[mid]){
            return reccursiveBinSearch(arr,key,mid+1,end);
        }
        else {
            return reccursiveBinSearch(arr,key,start,mid-1);
        }

    }

    public static void main(String[] args) {
        int [] arr = {2,5,9,10,12};
        System.out.println(reccursiveBinSearch(arr,9,0, arr.length-1));
    }
}
