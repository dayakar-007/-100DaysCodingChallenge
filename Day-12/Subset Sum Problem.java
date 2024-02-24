class Solution{

static int subset(int n,int[] arr,int sum,int[][] dp)
    {
        if(sum==0)
        {
            return 1;
        }
        if(n<0|| sum<0) return 0;
        if(dp[n][sum]!=-1) 
        {
            return dp[n][sum];
        }
        if(arr[n]<=sum)
        {
            return dp[n][sum]= subset(n-1,arr,sum-arr[n],dp)|subset(n-1,arr,sum,dp);
        }
        return dp[n][sum]=subset(n-1,arr,sum,dp);
        
    }

    static Boolean isSubsetSum(int N, int arr[], int sum){
     int dp[][]=new int[N+1][sum+1];
     for(int[] ar:dp)
     {
         Arrays.fill(ar,-1);
     }
        return subset(N-1,arr,sum,dp)==1?true:false;
    
    }
}