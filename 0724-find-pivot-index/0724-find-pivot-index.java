class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int arr:nums)
        {
            total+=arr;
        }
        int left=0;
        for(int i=0;i<n;i++)
        {
            total-=nums[i];
            if(left==total)
            {
                return i;
            }
            left+=nums[i];
        }
        return -1;

        
    }
}