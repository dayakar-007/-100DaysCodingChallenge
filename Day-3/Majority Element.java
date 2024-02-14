class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums)
        {
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            }
            else
            {
                map.put(a,1);
            }
        }
        int n=nums.length/2;
        for(HashMap.Entry<Integer,Integer> x:map.entrySet())
        {
            if(x.getValue()>n) return x.getKey();
        }
        return 0;
    }
}