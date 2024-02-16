class Pair
{
    int v;
    int col;
    Pair(int v,int col)
    {
        this.v=v;
        this.col=col;
    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        //convert graph into arraylist
        ArrayList<ArrayList<Integer>> gr=new ArrayList<>();
        for(int i=0;i<graph.length;i++)
        {
            ArrayList<Integer> gra=new ArrayList<>();
            for(int j=0;j<graph[i].length;j++)
            {
                gra.add(graph[i][j]);
            }
            gr.add(gra);
        }
        int visit[]=new int[gr.size()];
        Arrays.fill(visit,-1);
        
        for(int x=0;x<visit.length;x++)
        {
        if(visit[x]==-1){
        Queue<Pair> que=new LinkedList<>();
        que.add(new Pair(x,0));
        visit[x]=0;
        while(!que.isEmpty())
        {
            int n=que.peek().v;
            int col=que.peek().col;
            que.remove();
            ArrayList<Integer> arr=gr.get(n);
            for(int i:arr)
            {
               
                if(visit[i]==-1)
                {
                visit[i]=1-col;
                que.add(new Pair(i,visit[i]));
                }
                else if(visit[i]==col) return false;

            }
        }
            }
        }
        return true;
        
    }
}