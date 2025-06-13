package DataStructures.NonLinear.graphs.CycleDetection.bfsUndirected;
import java.util.*;

public class GraphCycleDetectBFSUndirected
{
    private boolean detect(int src , List<List<Integer>> adjList , int [] visited){
        visited[src] = 1;
        Queue<int []> q = new LinkedList<>();
        q.add(new int []{src,-1}); // node , parent
        while (!q.isEmpty()){
            int [] pair = q.poll();
            int node = pair[0];
            int parent = pair[1];
            for (int adjNode : adjList.get(node)){
                if(visited[adjNode]==0){
                    visited[adjNode] = 1;
                    q.add(new int[]{adjNode,node});
                }
                else if (parent!=adjNode){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycle(int V , List<List<Integer>> adjList){
        int [] visited = new int[V+1]; // 0 based indexing
        for (int i =1;i<=V ; i++){
            if(visited[i]==0){
                if(detect(i,adjList,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0;i<=V;i++){
            adjList.add(new ArrayList<>());
        }

        adjList.get(1).addAll(Arrays.asList(2,3));
        adjList.get(2).addAll(Arrays.asList(1,5));
        adjList.get(3).addAll(Arrays.asList(1,4,6));
        adjList.get(4).add(3);
        adjList.get(5).addAll(Arrays.asList(3,7));
        adjList.get(6).addAll(Arrays.asList(3,7));
        adjList.get(7).addAll(Arrays.asList(5,6));

        GraphCycleDetectBFSUndirected obj = new GraphCycleDetectBFSUndirected();
        boolean ans = obj.isCycle(V,adjList);
        if(ans){
            System.out.println("Cycle Detected.");
        }
        else {
            System.out.println("Cycle Not detected");
        }

    }
}
