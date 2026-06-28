class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int num:nums)
        {
            currentsum+=num;
            maxsum=Math.max(maxsum,currentsum);
            if(currentsum<0)
            {
                currentsum=0;
            }
        }
        return maxsum;
        
    }
}