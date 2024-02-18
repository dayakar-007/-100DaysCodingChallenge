//BrackTracking
//----------------------------------------------------------------------------------------------------------
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int[] visit=new int[nums.length];
        List<List<Integer>> ans=new ArrayList<>();
        Backtraking(nums,visit,ans,new ArrayList<>());
        return ans;
        
    }
    public void Backtraking(int[] nums,int[] visit,List<List<Integer>> ans,List<Integer>re)
    {
        if(re.size()==nums.length)
        {
            ans.add(new ArrayList(re));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visit[i]==0)
            {
                visit[i]=1;
                re.add(nums[i]);
                Backtraking(nums,visit,ans,re);
                re.remove(re.size()-1);
                visit[i]=0;
            }
        }
    }
}