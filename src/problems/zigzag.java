package problems;

public class zigzag {
    public static void print(int cols){
        for(int r = 1;r<=3;r++){
            for(int j = 1;j<=cols;j++){
                if((
                        r==1 && ((1+j) % 4 ==0)) ||
                        r==2 && ((2+j)%2==0) ||
                        r==3 && ((3+j)%4==0)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(9);
        System.out.println();
        print(13);
        System.out.println();
        print(17);
    }
}
