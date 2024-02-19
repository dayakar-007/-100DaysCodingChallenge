class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String x="1";
        for(int i=1;i<n;i++)
        {
            x=Solution(x);
        }
        return x;

        
    }
    public String Solution(String s)
    {
        int  i=0;
        int j=0;
        int n=s.length();
        String re="";
        while(i<n)
        {
            while(j<n && s.charAt(i)==s.charAt(j))
            {
                j++;
            }
            int count=j-i;
            re+=Integer.toString(count)+s.charAt(i)+"";
            i=j;

        }
        return re;

    }
}