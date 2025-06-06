package Algorithms;

//inplace sorting
public class quickSort {
      public static void sort(int [] arr,int s,int e){
          //base case for single element or out of bounds
          if(s>=e){
              return;
          }

          //find partition
          int p= partition(arr,s,e);

          //recursion to sort left and right
          sort(arr,s,p-1); //left
          sort(arr,p+1,e); //right
      }

      public static void swap(int [] arr , int i , int j ){
          int temp = arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
      }

    public static int partition(int [] arr , int s , int e ){
          int pivot = arr[s];
          int count = 0;
          for(int i = s+1;i<=e;i++){
              if(arr[i]<pivot){
                  count++;
              }
          }
          int pivotIndex = s+count;
          swap(arr,pivotIndex,s);

          int i = s;
          int j =e;
          while(i<pivotIndex && j>pivotIndex){
              while (arr[i]<pivot){
                  i++;
              }
              while (arr[j]>pivot){
                  j--;
              }
              if(i<pivotIndex && j>pivotIndex){
                  swap(arr,i,j);
              }
          }
          return pivotIndex;
    }

    public static void main(String[] args) {
        int [] arr={5,9,1,6,4,-2};
        sort(arr,0, arr.length-1);
        System.out.print("Array after sorting : ");
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
