class Solution {
    public int subarraySum(int[] nums, int k) {
        //map with prefix sum as key and count as value
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int pre_sum=0;
        int c=0;
        for(int i:nums)
        {
            pre_sum+=i;
            if(map.containsKey(pre_sum-k))
            {
                c+=map.get(pre_sum-k);
            }
            map.put(pre_sum,map.getOrDefault(pre_sum,0)+1);
        }
        return c;
    }
}