class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que=new PriorityQueue<Integer>();
        for(int i:nums)
        {
            if(que.size()<k)
            {
                que.add(i);
            }
            else
            {
                if(que.peek()<i)
                {
                    que.remove(que.peek());
                    que.add(i);
                }
            }
        }
        return que.peek();
        
    }
}