class Pair
{
    int row;
    int col;
    int dis;
    Pair(int row,int col,int dis)
    {
        this.row=row;
        this.col=col;
        this.dis=dis;
        
    }
}
class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        int m=grid.length;
        int n=grid[0].length;
        int visit[][]=new int[m][n];
        int disit[][]=new int[m][n];
        Queue<Pair> que=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    que.add(new Pair(i,j,0));
                    visit[i][j]=1;
                }
            }
        }
        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};
        while(!que.isEmpty())
        {
            int sr=que.peek().row;
            int sc=que.peek().col;
            int d=que.peek().dis;
            disit[sr][sc]=d;
            que.remove();
            for(int k=0;k<4;k++)
            {
                int drow=sr+row[k];
                int dcol=sc+col[k];
                if(drow>=0 && drow<m && dcol>=0 && dcol<n && visit[drow][dcol]==0)
                {
                    visit[drow][dcol]=1;
                    que.add(new Pair(drow,dcol,d+1));
                }
            }
        }
        return disit;
        
    }
}