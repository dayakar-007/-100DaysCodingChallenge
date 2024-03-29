//DFS SOLUTION

class Solution {
    public void DFS(int sr,int sc,int[][] grid,int[][] visit,ArrayList<String> ans,int[] row,int[] col,int m,int n,int ro,int co)
    {
        visit[sr][sc]=1;
        ans.add(tostring(sr-ro,sc-co));
        for(int i=0;i<4;i++)
        {
            int mrow=sr+row[i];
            int ncol=sc+col[i];
            if(mrow>=0 && mrow<m && ncol>=0 && ncol<n && grid[mrow][ncol]==1 && visit[mrow][ncol]==0)
            {
                DFS(mrow,ncol,grid,visit,ans,row,col,m,n,ro,co);
            }
        }
        
    }
    public String tostring(int i,int j)
    {
        return Integer.toString(i)+" "+Integer.toString(j);
    }
    int countDistinctIslands(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] visit=new int[m][n];
        HashSet<ArrayList<String>> set=new HashSet<>();
        int[] row={-1,0,1,0};
        int[] col={0,-1,0,1};
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && visit[i][j]==0)
                {
                    ArrayList<String> ans=new  ArrayList<>();
                    DFS(i,j,grid,visit,ans,row,col,m,n,i,j);
                    set.add(ans);
                }
            }
        }
        return set.size();
    }
}
//BFS solution
class Pair
{
    int row;
    int col;
    Pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public void BFS(int i,int j,int[][] grid,int[][] visit,ArrayList<String> ans)
    {
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair> que=new LinkedList<>();
        que.add(new Pair(i,j));
        visit[i][j]=1;
        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};
        while(!que.isEmpty())
        {
            int sr=que.peek().row;
            int sc=que.peek().col;
            ans.add(tostring(sr-i,sc-j));
            que.remove();
            for(int k=0;k<4;k++)
            {
                int mrow=sr+row[k];
                int ncol=sc+col[k];
                if(mrow>=0 && mrow<m && ncol>=0 && ncol<n && grid[mrow][ncol]==1 && visit[mrow][ncol]==0)
                {
                    visit[mrow][ncol]=1;
                    que.add(new Pair(mrow,ncol));
                }
            }
        }
        
        
    }
    public String tostring(int i,int j)
    {
        return Integer.toString(i)+" "+Integer.toString(j);
    }

    int countDistinctIslands(int[][] grid) {
        int[][] visit=new int[grid.length][grid[0].length];
        HashSet<ArrayList<String>> set=new HashSet<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1 && visit[i][j]==0)
                {
                    ArrayList<String> ans=new ArrayList<>();
                    BFS(i,j,grid,visit,ans);
                    set.add(ans);
                }
            }
        }
        return set.size();
        
    }
}


