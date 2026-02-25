class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < V;i++){
            adj.add(new ArrayList<>());
        }
        int[] degree = new int[V];
        for(int [] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            degree[v]++;
        }
    Queue<Integer> q =  new LinkedList<>();
    for(int i = 0; i < V;i++){
        if(degree[i] == 0){
            q.offer(i);
        }
    }
    int count = 0;
    while(!q.isEmpty()){
        int node = q.poll();
        count++;
         for(int neighbor : adj.get(node)){
                degree[neighbor]--;
                
                if(degree[neighbor] == 0){
                    q.offer(neighbor);
                }
            }
    }
    return count != V;
    }
}
