class Solution {
    public void abcd(int[] nums,int l,int h)
    {
        while(l<=h)
        {
            int temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
            l++;
            h--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        {
            abcd(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>=idx;i--)
        {
            if(nums[i]>nums[idx])
            {
                int temp=nums[idx];
                nums[idx]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        abcd(nums,idx+1,n-1);
        
    }
}