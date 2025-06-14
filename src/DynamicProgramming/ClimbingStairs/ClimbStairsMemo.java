package DynamicProgramming.ClimbingStairs;

import java.util.Arrays;

public class ClimbStairsMemo {

    public static int climb(int n , int [] dp){
        if(n<=1) return 1;

        //Step 2 : if u have the value return it don't calculate it
        if(dp[n]!=-1){
            return dp[n];
        }

        //step 3 : if u don't have the value calculate it
        return dp[n] = climb(n-1,dp) + climb(n-2,dp);
    }
    public static void main(String[] args) {
        int n=4;

        //step 1
        int [] dp = new int[n+1]; //0 based indexing
        Arrays.fill(dp,-1);  // fill with default values -1;
        System.out.println("Ways to climb " + n + " stairs : " + climb(n,dp));
    }
}
