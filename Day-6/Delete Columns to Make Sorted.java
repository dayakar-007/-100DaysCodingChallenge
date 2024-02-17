class Solution {
    public boolean cheak(int pos,String[] s)
    {
        for(int i=1;i<s.length;i++)
        {
            if((int)s[i].charAt(pos)<(int)s[i-1].charAt(pos)) return  false;
        }
        return true;
    }
    public int minDeletionSize(String[] strs) {
        int n=0;
        for(int i=0;i<strs[0].length();i++)
        {
            if(cheak(i,strs)==false) n++;
        }
        return n;
        
    }
}