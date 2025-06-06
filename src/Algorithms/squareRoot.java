package Algorithms;

public class squareRoot {
        public static int SquareRoot(int n)
        {
            int start=0, end = n , ans = 0;
            while(start<=end)
            {
                int mid = start + (end-start)/2;
                int sq = mid*mid;
                if(sq==n)
                {
                    return mid;
                }
                else if(sq<n)
                {
                     ans = mid;
                     start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            return ans;
        }


        public static void main(String[] args) {
            System.out.println(SquareRoot(36));
        }
    }

