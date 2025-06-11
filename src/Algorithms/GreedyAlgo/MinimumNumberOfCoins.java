package Algorithms.GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNumberOfCoins {

    static void  findMinCoins(List<Integer> coins , int V){

        List<Integer> result = new ArrayList<>();
        for(int i = coins.size()-1;i>=0;i--){
            while (V>=coins.get(i)){
                V-=coins.get(i);
                result.add(coins.get(i));
            }
        }

        System.out.print("Coins selected : ");
        for (int coin :result){
            System.out.print(coin+ " ");
        }
        System.out.println();
        System.out.println("min number of coins:" + result.size());
    }


    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1,2,5,10,20,50,100,200,500,1000,2000);
        int v1=91;
        findMinCoins(coins,v1);
    }
}
