class Solution {
    boolean DFS(List<List<Integer>> adj,int[] visit,int path[],int node)
    {
        visit[node]=1;
        path[node]=1;
        List<Integer> arr=adj.get(node);
        for(int a:arr)
        {
            if(visit[a]==0)
            {
                if(DFS(adj,visit,path,a)) return true;
            }
            else if(path[a]==1)
            {
                return true;
            }
        }
        path[node]=0;
        return false;
    }

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
        List<Integer> ans=new ArrayList<>();
        int visit[]=new int[V];
        int path[]=new int[V];
        for(int i=0;i<V;i++)
        {
            if(visit[i]==0)
            {
                DFS(adj,visit,path,i);
            }
        }
        for(int i=0;i<V;i++)
        {
            if(path[i]==0)
            {
                ans.add(i);
            }
        }
        return ans;

    
    }
}