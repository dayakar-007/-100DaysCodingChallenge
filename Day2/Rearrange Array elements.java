class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int neg[]=new int[nums.length/2];
        int i=0;
        int j=0;
        for(int a:nums)
        {
            if(a>0)
            {
                pos[i++]=a;
            }
            else
            {
                neg[j++]=a;
            }
        }
        i=0;
        j=0;
        while(i<nums.length)
        {
            nums[i++]=pos[j];
            nums[i++]=neg[j++];
        }
        return nums;
        
    }
}