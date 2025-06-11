package Algorithms.GreedyAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class nikunjAndDonuts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter calories");
        int n =sc.nextInt();
        int [] calories = new int[n];
        System.out.println("Enter calories");
        for (int i = 0;i<n;i++){
            calories[i] = sc.nextInt();
        }

        //sort array in descending order to eat highest calorie donut first
        Arrays.sort(calories);
        int left = 0;
        int right  = n-1;
        while (left<right){
            int temp = calories[left];
            calories[left] = calories[right];
            calories[right]=temp;
            left++;
            right--;
        }
        long totalMiles = 0;
//        for (int i = 0;i<n;i++){
//            totalMiles+= Math.pow(2,*)*calories[i];
//        }

        for (int i = 0;i<n;i++){
            totalMiles+= (1L<<i)*calories[i];
        }
        System.out.println(totalMiles + " miles");
    }
}
