CODE LINK : https://leetcode.com/problems/network-delay-time/description/
class Solution {
    class Pair{
        int vertex;
        int time;
        public Pair(int des, int w){
            this.vertex = des;
            this.time = w;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Pair>[]graph = new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<times.length; i++){
            int src = times[i][0];
            int des = times[i][1];
            int w = times[i][2];
            graph[src].add(new Pair(des, w));
        }
        int timeForEachVertex[] = new int[n+1];
        for(int i=1; i<=n; i++){
            timeForEachVertex[i] = Integer.MAX_VALUE;
        }
        int visited[] = new int[n+1];
        PriorityQueue<Pair> pq = new PriorityQueue<>( (a,b)-> a.time-b.time);
        pq.add(new Pair(k, 0));
        // visited[k] = 1;
        while(pq.size() > 0){
            Pair rem = pq.remove();
            if( timeForEachVertex[rem.vertex] > rem.time ){
                timeForEachVertex[rem.vertex] = rem.time;
            }
            visited[rem.vertex] = 1;
            ArrayList<Pair> nbrs = graph[rem.vertex];
            for(Pair nbr : nbrs){
                int ver = nbr.vertex;
                int time = nbr.time;
                if(visited[ver] == 0)pq.add(new Pair(ver, time+rem.time) );
            }
        }
        int ans = 0;
        for(int i=1; i< timeForEachVertex.length; i++){
            if(timeForEachVertex[i] == Integer.MAX_VALUE){
                return -1;
            }
            if(ans < timeForEachVertex[i] ){
                ans = timeForEachVertex[i];
            }
        }
        return ans;
    }
}
