class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            currentSum+=nums[i];
            maxSum=Math.max(currentSum,maxSum);
            if(currentSum<1)
            {
                currentSum=0;
            }
        }
        return maxSum;
        
    }
}