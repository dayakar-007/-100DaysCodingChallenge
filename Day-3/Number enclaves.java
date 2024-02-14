//this problem is same as the surround Regions 
class Solution {
    public void DFS(int sr,int sc,int[][] grid,int[][] visit,int m,int n,int[] row,int[] col)
    {
        visit[sr][sc]=1;
        for(int i=0;i<4;i++)
        {
            int mrow=sr+row[i];
            int ncol=sc+col[i];
            if(mrow>=0 && mrow<m && ncol>=0 && ncol<n && grid[mrow][ncol]==1 && visit[mrow][ncol]==0)
            {
                DFS(mrow,ncol,grid,visit,m,n,row,col);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] visit=new int[m][n];
        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};
        for(int i=0;i<m;i++)
        {
            if(grid[i][0]==1 && visit[i][0]==0)
            {
                DFS(i,0,grid,visit,m,n,row,col);
            }
            if(grid[i][n-1]==1 && visit[i][n-1]==0)
            {
                DFS(i,n-1,grid,visit,m,n,row,col);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(grid[0][i]==1 && visit[0][i]==0)
            {
                DFS(0,i,grid,visit,m,n,row,col);
            }
            if(grid[m-1][i]==1 && visit[m-1][i]==0)
            {
                DFS(m-1,i,grid,visit,m,n,row,col);
            }
        }
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && visit[i][j]==0)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}