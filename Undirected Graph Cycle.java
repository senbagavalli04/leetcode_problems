//CODE LINK : https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        int vis[] = new int[n];
        for(int i=0;i<n;i++){
            if(vis[i] == 0){
                boolean isCycle = dfs(adj, i , -1 , vis);
                if(isCycle == true) return true;
            }
        }
        return false;
    }
    boolean dfs(ArrayList<ArrayList<Integer>> graph, int src , int p, int[] vis){
        vis[src] = 1;
        for(int nbr : graph.get(src)){
            if(vis[nbr] == 0){
            boolean flag = dfs(graph, nbr , src , vis);
            if(flag == true ) return true;
            }
            else if(nbr != p){
             return true;
            }
        }
        return false;
    }
}
