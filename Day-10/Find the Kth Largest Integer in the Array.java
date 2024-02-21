import java.math.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<BigInteger> que=new PriorityQueue<>();
        for(String i:nums)
        {
            que.add(new BigInteger(i));
            if(que.size()>k)
            {
                que.poll();
            }
        }
        return que.peek().toString();

    }
}