class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
            if(!map.containsKey(i)) map.put(i,0);
            map.put(i,map.get(i)+1);
        }
        Map<Integer,ArrayList<Integer>> map1=new TreeMap<>();
        for(HashMap.Entry<Integer,Integer> m:map.entrySet())
        {
            int v=m.getValue();
            int k1=m.getKey();
            if(!map1.containsKey(v)) map1.put(v,new ArrayList<>());
            map1.get(v).add(k1);
        }
        int ele=0;
        for(Map.Entry<Integer,ArrayList<Integer>> m1:map1.entrySet())
        {
            int v=m1.getKey();
            ArrayList<Integer> a=m1.getValue();
            ArrayList<Integer> re=new ArrayList<>();
            int flag=0;
            int c=0;
            for(int i:a)
            {
                if(k<v) 
                {
                    flag=1;
                    break;
                }
                k-=v;
                re.add(i);
            }
            for(int i:re)
            {
                a.remove(Integer.valueOf(i));
                //al.remove(Integer.valueOf(1)); 
  
            }
            if(flag==1)
                {
                    break;
                }

        }
        int ans=0;
        for(Map.Entry<Integer,ArrayList<Integer>> m2:map1.entrySet())
        {
            ans+=m2.getValue().size();
        }
        return ans;

        
    }
}