class Solution {
    public void reverse(int i,int j,char[] str)
    {
// reverse the character in array with the range of i,j
        while(i<=j)
        {
            char t=str[i];
            str[i]=str[j];
            str[j]=t;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
        int n=s.length();
        char[] str=s.toCharArray();
        for(int i=0;i<n;i+=2*k)
        {
//reverse the first k character of 2k length string
            if(i+k-1<=n-1)
            {
                reverse(i,i+k-1,str);
            }
// if length of string in less than k,then reverse the remaining characters
            else
            {
                reverse(i,n-1,str);
            }
        }
//convert the array into string
        return new String(str);
        
    }
}