class Solution {
    public void nextPermutation(int[] nums) {
       int i=nums.length-2;
       while(i>=0 && nums[i]>=nums[i+1])
       {
        i--;
       }
       if(i>=0)
       {
        int j=nums.length-1;
        while(nums[j]<=nums[i])
        {
            j--;
        }
        swap(nums,i,j);
       }
       reverse(nums,i+1,nums.length-1);

        
    }
    private void swap(int[] num,int i, int j)
    {
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
    private void reverse(int[] num,int left,int right)
    {
        while(left<right)
        {
        swap(num,left,right);
        left++;
        right--;
        }
    }
}