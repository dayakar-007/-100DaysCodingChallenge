class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        int start=0;
        int max_fre=-1;
        Map<Character,Integer> map=new HashMap<>();
        for(int end=0;end<s.length();end++)
        {
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            max_fre=Math.max(max_fre,map.get(s.charAt(end)));
            while((end-start+1)-max_fre>k)
            {
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }
            ans=Math.max(end-start+1,ans);
        }
        return ans;
        
    }
}