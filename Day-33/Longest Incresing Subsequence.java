class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int[nums.length+1][nums.length+1];
        for(int []arr:dp)
        {
            Arrays.fill(arr,-1);
        }
        return solution(0,nums.length,nums,-1,dp);
    }
    public static int solution(int i,int n,int[] arr,int pre,int[][] dp)
    {
        if(i==n) return 0;
        // not taken
        if(dp[i][pre+1]!=-1) return dp[i][pre+1];
        int not_taken=0+solution(i+1,n,arr,pre,dp);
        //taken case
        int taken=0;
        if(pre==-1 || arr[pre]<arr[i])
        {
            taken=1+solution(i+1,n,arr,i,dp);
        }
        return dp[i][pre+1]=Math.max(not_taken,taken);
        //note pre inx starting from -1.but in dp array indices  are starting frrom 0.so here in dp array
        //-1 represent as 0,0->1,...........
    }
}