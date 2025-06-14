package DynamicProgramming.Fibonacci;

public class fibonacciRecur {

    public static int fibRecc(int  n){
        if(n<=1){
            return n;
        }
        return (fibRecc(n-1) + fibRecc(n-2));
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci of " + n + "th position is " + fibRecc(n));
    }
}
