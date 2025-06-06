package Algorithms;

public class Occurrences {
     static int FirstOccurrence(int [] arr , int key){
        int ans=-1,start = 0 , end = arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]<key) {
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }

     static int LastOccurrence(int [] arr , int key){
        int ans=-1,start = 0 , end = arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]<key) {
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;

    }

     static int TotalOccurence(int [] arr,int key){
            int f,l;
            f=FirstOccurrence(arr,key);
            l=LastOccurrence(arr,key);
            int total = l-f+1;
            return total;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,3,4,5};
        int Fo=FirstOccurrence(arr,3);
        int Lo=LastOccurrence(arr,3);
        int To=TotalOccurence(arr,3);
        System.out.println("First:"+Fo+ ",Last:"+Lo+",Total:"+To );

    }
}

