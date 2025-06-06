package Algorithms;

public class jaggedArrays {
    public static void main(String[] args) {
        int [][] jagged = {{1,2,3,4} ,
                           {5,6,7},
                           {8,9}};

        for(int i =0 ; i<jagged.length;i++){
            for (int j = 0;j<jagged[i].length;j++){
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        for(int [] arr : jagged){
            for (int x :arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        char [][] languages= {{'J','A','V','A'} ,
                {'C','+','+'},
                {'P','Y','T','H','O','N'}};

        for(char[] ch : languages){
            for (char x :ch){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static class hammingWeight {
        static int hammingWeight(int n){
            int count=0;

            while(n>0){
                if((n&1)==0){
                    count++;
                }
                n=n>>1;
            }
            return count;
        }

        public static void main(String[] args) {
            System.out.println(hammingWeight(11));
            System.out.println(hammingWeight(15));
        }
    }
}
