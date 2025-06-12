package DataStructures.NonLinear.graphs;

import java.util.Scanner;

public class GraphMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nodes");
        int n = sc.nextInt();
        System.out.println("Enter Edges");
        int m= sc.nextInt();
        int [][] adjMatrix = new int[n+1][n+1]; // for 0-based indexing
        System.out.println("Enter graph nodes : ");
        for (int i =0 ;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1; // removing this makes the graph directed
        }

        System.out.println("The adjacency matrix is : ");
        for (int i =0;i<=n;i++){
            for (int j =0;j<=n;j++){
                System.out.print(adjMatrix[i][j]+ " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
