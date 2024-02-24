class Solution {
    public int subset(int n,int[] nums,int sum,int[][] dp)
    {
        if(sum==0) return 1;
        if(sum<0 || n<0) return 0;
        if(dp[n][sum]!=-1) return dp[n][sum];
        //case-1:taken
        if(nums[n]<=sum)
        {
            return dp[n][sum]=subset(n-1,nums,sum-nums[n],dp)|subset(n-1,nums,sum,dp);
        }
        return dp[n][sum]=subset(n-1,nums,sum,dp);
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        if(sum%2==1) return false;
        int dp[][]=new int[nums.length+1][sum+1];
        for(int[] arr:dp)
        {
            Arrays.fill(arr,-1);
        }
        return subset(nums.length-1,nums,sum/2,dp)==1?true:false;
        
    }
}