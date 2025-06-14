package DynamicProgramming.Fibonacci;

import java.util.Arrays;

public class FibTabulation {
    public static int fib(int n ){
        if(n<=1) return 1;

        int []dp = new int [n+1];
        dp[0]=0;
        dp[1]=1;

        for (int i =2 ; i<=n ; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci of " + n + "th position is " + fib(n));
    }

}
