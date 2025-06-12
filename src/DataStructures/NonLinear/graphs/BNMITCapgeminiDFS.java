package DataStructures.NonLinear.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

class graphDFS1{

    private void dfs(int node, List<List<Integer>> adjList, boolean[] visited, List<Integer> ans){

        visited[node] = true;
        ans.add(node);
        for (int neighboor : adjList.get(node)){
            if(!visited[neighboor]){
                dfs(neighboor,adjList,visited,ans);
            }
        }
    }


    public List<Integer> dfsGraph(int V , List<List<Integer>> adjList){
        boolean[] visited = new boolean[V+1];
        List<Integer> ans  = new ArrayList<>();
        int start =1;
        dfs(start,adjList,visited,ans);
        return ans;
    }
}
public class BNMITCapgeminiDFS {

    public static void main(String[] args) {
        int V = 10;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0;i<=V ; i++){
            adjList.add(new ArrayList<>());
        }
        addEdge(adjList,1,2);
        addEdge(adjList,1,7);
        addEdge(adjList,2,3);
        addEdge(adjList,2,6);
        addEdge(adjList,3,4);
        addEdge(adjList,3,5);
        addEdge(adjList,7,8);
        addEdge(adjList,7,10);
        addEdge(adjList,8,9);



        graphDFS1 obj = new graphDFS1();
        List<Integer> ans = obj.dfsGraph(V,adjList);
        printDFS(ans);

    }

    public static void addEdge(List<List<Integer>> adj , int u , int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void printDFS(List<Integer> ans){
        for (int num :ans){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

