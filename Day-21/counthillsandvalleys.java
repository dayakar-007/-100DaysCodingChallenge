class Solution {
    public int countHillValley(int[] nums) {
        int start=nums[0];
        int c=0;
        for(int i=1;i<nums.length-1;i++)
        {
            if(start<nums[i] && nums[i]>nums[i+1] || start>nums[i] && nums[i]<nums[i+1])
            {
                c++;
                start=nums[i];
            }
        }
        return c;
        
    }
}