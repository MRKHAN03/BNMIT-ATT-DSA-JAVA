package DataStructures.NonLinear.graphs.CycleDetection.dfsUndirected;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphCycleDetectDFSDirected {

    private boolean dfsCheck(int node, List<List<Integer>> adjList,int [] visited , int[] pathVis ){
        visited[node]=1;
        pathVis[node]=1;
        for (int it : adjList.get(node)){
            if(visited[it]==0)
            {
                if (dfsCheck(it,adjList,visited,pathVis))
                {
                    return true;
                } else if (pathVis[it]==1) {
                    return true;
                }
            }
            pathVis[node]=0;
        }
        return false;
    }

    public boolean isCyclic(int V , List<List<Integer>> adjList){
        int [] visited = new int[V+1];
        int [] pathVis = new int[V+1];// 0 based indexing
        for (int i =1;i<=V ; i++){
            if(visited[i]==0){
                if(dfsCheck(i,adjList,visited,pathVis)){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int V = 10;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0;i<=V;i++){
            adjList.add(new ArrayList<>());
        }

        adjList.get(1).add(2);
        adjList.get(2).addAll(Arrays.asList(3,8));
        adjList.get(3).addAll(Arrays.asList(4,7));
        adjList.get(4).add(5);
        adjList.get(5).add(6);
        adjList.get(7).add(5);
        adjList.get(8).add(9);
        adjList.get(9).add(10);
        adjList.get(10).add(8); // this creates a cycle 8->9->10->8

        GraphCycleDetectDFSDirected obj = new GraphCycleDetectDFSDirected();
        boolean ans = obj.isCyclic(V , adjList);
        if(ans){
            System.out.println("Cycle Detected.");
        }
        else {
            System.out.println("Cycle Not detected");
        }


    }
}
