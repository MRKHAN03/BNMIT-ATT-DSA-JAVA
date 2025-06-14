package DynamicProgramming.Fibonacci;

import java.util.Arrays;

public class fibSpaceOpt {

    public static int fib(int n){
        if(n<=1) return n;
        int p2=0;
        int p1 = 1;
        for (int i=2;i<=n;i++){
            int curr = p1+p2;
            p2=p1;
            p1=curr;
        }
        return p1;
    }

    public static void main(String[] args) {
            int n=6;

            System.out.println("Fibonacci of " + n + "th position is " + fib(n));

    }
}
