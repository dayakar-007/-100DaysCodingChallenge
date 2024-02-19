class Solution {
    public boolean DFS(ArrayList<ArrayList<Integer>> gra,int[] visit,int[] path,int course)
    {
        visit[course]=1;
        path[course]=1;
        ArrayList<Integer> arr=gra.get(course);
        for(int a:arr)
        {
            if(visit[a]==0)
            {
                if(DFS(gra,visit,path,a)) return true;
            }
            else if(path[a]==1) return true;
        }
        path[course]=0;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> pre=new ArrayList<>();
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
        //cheack in this graph their exist a cycle or not
        //if cycle exist its imposible to finish the all courses
        int visit[]=new int[numCourses];
        int pathvisit[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(visit[i]==0)
            {
                 if(DFS(pre,visit,pathvisit,i)==true) return false;
            }
        }
        return true;
    }
}