//CODE LINK: https://leetcode.com/problems/number-of-provinces/
class Solution {
    public int findCircleNum(int[][] isConnected) {
       int ans = 0;
       int[] vis = new int[isConnected.length];
       for(int i=0;i<isConnected.length;i++){
        if(vis[i] == 0){
            dfs(isConnected,i,vis);
            ans++;
        }
     
       }
          return ans;
    }
    void dfs(int[][] isConnected,int src,int[] vis ){
        vis[src] = 1;
        for(int i=0;i<isConnected[0].length;i++){
            if(isConnected[src][i] == 1 && vis[i] == 0){
                dfs(isConnected,i,vis);
            }
        }
    }
}
