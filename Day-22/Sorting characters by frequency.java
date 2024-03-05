import java.util.*;
public class Solution {
    public static String sortByFrequency(int n, String s) {
        Map<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(!map1.containsKey(ch))
            {
                map1.put(ch,1);
            }
            else
            {
                map1.put(ch,map1.get(ch)+1);
            }
        }
        Map<Integer,ArrayList<Character>> map=new TreeMap<>();
        for(Map.Entry<Character,Integer> p:map1.entrySet())
        {
            int val=p.getValue();
            char ch=p.getKey();
            if(!map.containsKey(val)) map.put(val,new ArrayList<>());
            map.get(val).add(ch);
        }
        String res="";
        for(Map.Entry<Integer,ArrayList<Character>> p:map.entrySet())
        {
            int val=p.getKey();
            ArrayList<Character> arr=p.getValue();
            for(char ch:arr)
            {
                int i=1;
                while(i<=val)
                {
                res+=ch;
                i++;
                }
            }
        }
        return res;


    }
}