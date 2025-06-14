package DynamicProgramming.Fibonacci;
import java.util.Arrays;

public class FibMemoization { //Memoization is called as top-down Approach

    public static int fib(int n , int [] dp){
        if(n<=1) return n;

        //Step 2 : if u have the value return it don't calculate it
        if(dp[n]!=-1){
            return dp[n];
        }

        //step 3 : if u don't have the value calculate it
        return dp[n] = fib(n-1,dp) + fib(n-2,dp);
    }
    public static void main(String[] args) {
        int n=6;

        //step 1
        int [] dp = new int[n+1]; //0 based indexing
        Arrays.fill(dp,-1);  // fill with default values -1;
        System.out.println("Fibonacci of " + n + "th position is " + fib(n , dp));
    }
}
