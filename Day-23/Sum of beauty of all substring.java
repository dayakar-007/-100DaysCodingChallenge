class Solution {
    public int beautySum(String s) {
    int ans=0;
    for(int i=0;i<s.length();i++)
    {
        String str="";
        for(int j=i;j<s.length();j++)
        {
            str+=s.charAt(j);
            int[] arr=new int[26];
            for(int k=0;k<str.length();k++)
            {
                arr[str.charAt(k)-97]++;

            }
            int max=-1;
            int min=1000;
            for(int l=0;l<26;l++)
            {
                if(arr[l]!=0)
                {
                max=Math.max(max,arr[l]);
                min=Math.min(min,arr[l]);
                }
            }
            ans+=(max-min); 
        }
    }
    return ans;
    }
}