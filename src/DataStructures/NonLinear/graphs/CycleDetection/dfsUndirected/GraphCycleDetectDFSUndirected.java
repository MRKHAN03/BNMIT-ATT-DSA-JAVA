package DataStructures.NonLinear.graphs.CycleDetection.dfsUndirected;

import DataStructures.NonLinear.graphs.CycleDetection.bfsUndirected.GraphCycleDetectBFSUndirected;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphCycleDetectDFSUndirected {
    private boolean dfs(int node ,int parent , int [] visited , List<List<Integer>> adjList ){

        visited[node] =1;
        for (int adjNode : adjList.get(node)){
            if(visited[adjNode]==0){
                if(dfs(adjNode , node,visited,adjList)){
                    return true;
                }
            }
            else if (adjNode!=parent) {
                return true;
            }
        }
        return false;
    }


    public boolean detectCycle(int V , List<List<Integer>> adjList){
        int [] visited = new int [V+1];
        for (int i = 1;i<=V;i++){
            if(visited[i]==0){
                if(dfs(i,-1,visited,adjList)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adjList.add(new ArrayList<>());
        }

        adjList.get(1).addAll(Arrays.asList(2, 3));
        adjList.get(2).addAll(Arrays.asList(1,5));
        adjList.get(3).addAll(Arrays.asList(1, 4, 6));
        adjList.get(4).add(3);
        adjList.get(5).addAll(Arrays.asList(3, 7));
        adjList.get(6).addAll(Arrays.asList(3, 7));
        adjList.get(7).addAll(Arrays.asList(5, 6));

        GraphCycleDetectDFSUndirected obj = new GraphCycleDetectDFSUndirected();
        boolean ans = obj.detectCycle(V, adjList);
        if (ans) {
            System.out.println("Cycle Detected.");
        } else {
            System.out.println("Cycle Not detected");
        }
    }
}
