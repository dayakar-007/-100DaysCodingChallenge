class Solution {
    int start=0;
    int max_len=1;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length()-1;i++)
        {
            palindrome(i,i,s);
            palindrome(i,i+1,s);
        }
        return s.substring(start,start+max_len);
    }
    public void palindrome(int i,int j,String s)
    {
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        int len=j-i-1;
        if(len>max_len)
        {
            start=i+1;
            max_len=len;
        }
    }
}