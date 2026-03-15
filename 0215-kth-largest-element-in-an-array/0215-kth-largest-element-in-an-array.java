class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>q=new PriorityQueue<>();
        for(int arr:nums)
        {
            q.add(arr);
            if(q.size()>k)
            {
                q.poll();
            }
        }
        return q.peek();
        
    }
}