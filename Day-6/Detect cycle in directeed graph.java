class Solution {
    public boolean DFS(ArrayList<ArrayList<Integer>> adj,int par,int[] visit,int[] path)
    {
        visit[par]=1;
        path[par]=1;
        ArrayList<Integer> arr=adj.get(par);
        for(int a:arr)
        {
            if(visit[a]==0)
            {
                if(DFS(adj,a,visit,path)==true) return true;
            }
            else if(path[a]==1) return true;
        }
        path[par]=0;
        return false;
    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int visit[]=new int[V];
        int path[]=new int[V];
        for(int i=0;i<V;i++)
        {
            
            if(visit[i]==0)
            {
                if(DFS(adj,i,visit,path)==true) return true;
            }
        }
        return false;
    }
}