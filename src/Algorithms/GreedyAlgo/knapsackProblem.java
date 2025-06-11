package Algorithms.GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class knapsackProblem {

    static class Item{
        int value , weight;
        Item(int v , int w){
            value = v;
            weight =  w;
        }
    }

    static class ItemComparator implements Comparator<Item>{
        public int compare(Item a , Item b){
            double r1 = (double) a.value/a.weight;
            double r2 = (double) b.value/b.weight;
            return Double.compare(r2,r1);
        }
    }

    static double fractionalKnapsack(int[] values , int [] weights , int W){
        int n = values.length;
        Item[] items = new Item[n];
        for (int i = 0;i<n;i++){
            items[i] = new Item(values[i],weights[i]);
        }
        Arrays.sort(items,new ItemComparator());
        double totalValue = 0.0;
        for (int i = 0;i<n;i++){
            if(items[i].weight<=W)
            {
                totalValue+=items[i].value;
                W-=items[i].weight;
            }
            else {
                totalValue += ((double) items[i].value / items[i].weight)*W;
                break;
            }
        }
        return  totalValue;
    }

    public static void main(String[] args) {
        knapsackProblem kp = new knapsackProblem();
        int [] values = {60,100,120};

        int[] weights = {10,20,30};
        int W = 50;
        System.out.println(fractionalKnapsack(values,weights,W));
    }


}
