class Solution {
    public int longestValidParentheses(String s) {
        int l=0;
        int r=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                l++;
            }
            else
            {
                r++;
            }
            if(l==r)
            {
                max=Math.max(max,l+r);
            }
            if(r>l)
            {
                l=r=0;
            }
        }
        l=r=0;
         for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c==')')
            {
                l++;
            }
            else
            {
                r++;
            }
            if(l==r)
            {
                max=Math.max(max,l+r);
            }
            if(r>l)
            {
                l=r=0;
            }
        }
        

        return max;
        
    }
}