class Solution {
    public long largestPerimeter(int[] nums) {
        long sum=0;
        for(int a:nums)
        {
            sum+=a;
        }
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=n-1;i>=2;i--)
        {
            if(sum-nums[i]>nums[i]) return sum;
            sum-=nums[i];
        }
        return -1;
        
    }
}