class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int t=-(nums[i]+nums[j]);
                if(set.contains(t))
                {
                    List<Integer> l=new ArrayList<>();
                    l.add(t);
                    l.add(nums[i]);
                    l.add(nums[j]);
                    Collections.sort(l);
                    result.add(l);

                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>>ans=new ArrayList<>(result);
        return ans;
    
}
}