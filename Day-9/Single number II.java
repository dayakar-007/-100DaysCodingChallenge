class Solution {
    public int singleNumber(int[] nums) {
        int re=0;
        for(int i=0;i<32;i++)
        {
            int count=0;
            for(int num:nums)
            {
                if((num>>i&1)==1)
                {
                    count++;
                }
                
            }
            if(count%3!=0)
                {
                    re|=(1<<i);
                }
        }
        return re;
        
    }
}