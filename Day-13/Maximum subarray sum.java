class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int s=0;
        for(int i:nums)
        {
            s+=i;
            max=Math.max(s,max);
            if(s<=0)
            {
                s=0;
            }
        }
        return max;
        
    }
}