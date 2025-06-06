package Algorithms;

public class missingValues {
    public static int find(int[] arr){
        int st=0, end=arr.length-1;
        while(st<=end)
        {
            int mid = st + (end-st)/2;
            if(arr[mid]!=mid+1)
            {
                if(mid==0 ||  arr[mid-1]==mid){
                    return mid+1;
                }
                end=mid-1;
            }
            else if(arr[mid]==mid+1)
            {
                st=mid+1;
            }
        }
        return arr.length+1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6};
        int [] arr1={1,2,3,4,5,6};
        System.out.println(find(arr));
        System.out.println(find(arr1));
    }
}
