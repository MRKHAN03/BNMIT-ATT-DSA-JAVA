package DataStructures.NonLinear.graphs.TopoSort.BFSKahns;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopoSortBFSKahnCycleDetect {
    public boolean isCyclic(int V , ArrayList<ArrayList<Integer>> adj)
    {
        int [] inDegree = new int[V];
        for (int i = 0;i<V ; i++){
            for (int it : adj.get(i)){
                inDegree[it] ++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0;i<V ; i++){
            if (inDegree[i]==0){
                q.add(i);
            }
        }

        int count = 0;
        while (!q.isEmpty()){
            int node = q.poll();
            count++;
            for (int it : adj.get(node)){
                inDegree[it]--;
                if(inDegree[it]==0){
                    q.add(it);
                }
            }
        }

        return count!=V;
    }

    public static void main(String[] args) {
        int V  = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0;i<V ; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(2);


        TopoSortBFSKahnCycleDetect obj = new TopoSortBFSKahnCycleDetect();
        boolean ans = obj.isCyclic(V,adj);
        if (ans){
            System.out.println("Cycle Detected");
        }
        else {
            System.out.println("Cycle not detected");
        }
    }
}
