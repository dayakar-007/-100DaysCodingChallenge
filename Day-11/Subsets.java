class Solution {
    public void powerset(int nums[],int idx,List<List<Integer>> result,List<Integer> ans)
    {
        if(idx==nums.length)
        {
            if(!result.contains(ans))
            {
                result.add(new ArrayList<>(ans));
            }
            return ;
        }
        // Case-1
        //Take the element
        ans.add(nums[idx]);
        powerset(nums,idx+1,result,ans);
        ans.remove(ans.size()-1);
        powerset(nums,idx+1,result,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        powerset(nums,0,result,new ArrayList<>());
        return result;
        
    }
}