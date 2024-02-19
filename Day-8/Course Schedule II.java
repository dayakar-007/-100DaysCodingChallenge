class Solution {
     public boolean DFS(ArrayList<ArrayList<Integer>> gra,int[] visit,int[] path,int course,ArrayList<Integer> topo)
    {
        visit[course]=1;
       
        path[course]=1;
        ArrayList<Integer> arr=gra.get(course);
        for(int a:arr)
        {
            if(visit[a]==0)
            {
                if(DFS(gra,visit,path,a,topo)) return true;
            }
            else if(path[a]==1) return true;
        }
        path[course]=0;
         topo.add(course);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> pre=new ArrayList<>();
        int ans[]={};
        for(int i=0;i<numCourses;i++)
        {
            pre.add(new ArrayList<>());
        }
        int n=prerequisites.length;
        for(int i=0;i<n;i++)
        {
            int x=prerequisites[i][0];
            int y=prerequisites[i][1];
            pre.get(x).add(y);
        }
        ArrayList<Integer> topo=new ArrayList<>();
        //cheack in this graph their exist a cycle or not
        //if cycle exist its imposible to finish the all courses
        int visit[]=new int[numCourses];
        int pathvisit[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(visit[i]==0)
            {
                 if(DFS(pre,visit,pathvisit,i,topo)==true) return ans;
            }
        }
        int result[]=new int[topo.size()];
        int i=0;
        for(int t:topo)
        {
            result[i++]=t;
        }
        return result;
    }
        
    
}