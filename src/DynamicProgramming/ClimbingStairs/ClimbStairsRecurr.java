package DynamicProgramming.ClimbingStairs;

public class ClimbStairsRecurr {

    public static int climb(int  n){
        if(n<=1){
            return 1;
        }
        return (climb(n-1) + climb(n-2));
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Ways to climb " + n + " stairs : " + climb(n));
    }
}
