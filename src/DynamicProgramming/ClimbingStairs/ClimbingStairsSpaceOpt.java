package DynamicProgramming.ClimbingStairs;

public class ClimbingStairsSpaceOpt {

    public static int climb(int n) {
        if(n<=1) return 1;
        int p2=1;
        int p1 = 1;
        for (int i=2;i<=n;i++){
            int curr = p1+p2;
            p2=p1;
            p1=curr;
        }
        return p1;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Ways to climb " + n + " stairs : " + climb(n));
    }
}
