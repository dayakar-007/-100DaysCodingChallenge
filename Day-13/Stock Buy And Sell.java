class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] buy=new int[n];
        int max=prices[n-1];
        buy[n-1]=prices[n-1];
        for(int i=prices.length-2;i>=0;i--)
        {
            if(prices[i]>max)
            {
                buy[i]=prices[i];
            }
            else
            {
                buy[i]=max;
            }
            max=Math.max(max,prices[i]);
        }
        max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,buy[i]-prices[i]);
        }
        return max;
        
    }
}