class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            while(j<s.length() && map.size()<3)
            {
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                j++;
            }
            if(map.size()==3)
            {
            ans=ans+n-j+1;
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
            if(map.get(s.charAt(i))==0)
            {
                map.remove(s.charAt(i));
            }
            }
        }
        return ans;
        
    }
}