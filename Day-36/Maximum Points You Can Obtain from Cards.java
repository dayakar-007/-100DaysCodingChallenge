class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int[] prefix_sum=new int[n+1];
        int[] suffix_sum=new int[n+1];
        prefix_sum[0]=0;
        suffix_sum[n]=0;
        int max=-1;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++)
        {
            sum1+=cardPoints[i];
            sum2+=cardPoints[n-i-1];
            prefix_sum[i+1]=sum1;
            suffix_sum[n-i-1]=sum2;
        }
        for(int i=0;i<=k;i++)
        {
            max=Math.max(max,prefix_sum[i]+suffix_sum[n-(k-i)]);
        }
        return max;

        
    }
}