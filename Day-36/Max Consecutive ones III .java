class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int start=0;
        int end=0;
        int zero=0;
        int max=0;
        while(end<n)
        {
            if(nums[end]==0)
            {
                zero++;
            }
            if(zero<=k)
            {
                //exisit a answer
                max=Math.max(max,end-start+1);
            }
            while(zero>k)
            {
                if(nums[start]==0)
                {
                    zero--;
                }
                start++;
            }
            end++;
        }
        return max;


        
    }
}