class Solution {
    public boolean palindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String str:words)
        {
            if(palindrome(str)) return  str;
        }
        return "";
        
    }
}