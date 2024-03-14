class Solution {
    public int count(int []nums,int k)
    {
        int map=0;
        int j=0;
        int ans=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            while(j<n && map<k)
            {
                if(nums[j]%2==1)
                {
                    map++;
                }
                j++;
            }
            if(map>=k)
            {
                ans+=n-j+1;
            }
            if(map>=k)
            {
                if(nums[i]%2==1)
                {
                    map--;
                }
            }
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return count(nums,k)-count(nums,k+1);
    
    }
}